import java.util.ArrayList;

/*
1. 동기화를 시킨다 (음식이 없을 때, 손님이 table의 lock을 쥐고 안놓는다 / 요리사가 lock을 얻지 못해 table에 음식 추가할 수 없다)
2. wait()으로 손님의 lock을 풀 수 있다.
3. 요리사가 음식을 추가하면 notify()로 손님에게 lock을 재획득 할 수 있도록 알리자. 

단, 구분이 안됨 (누가 wait할지)
*/

class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
		
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name+" ate a "+food);
		}
	}
}

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table){this.table = table;}@Override
	
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}

class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { // 음식 추가
		while (dishes.size() >= MAX_FOOD) { // 음식이 꽉찬 상태
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting...");
			try {
				wait(); // cook 쓰레드를 기다리게 함. (음식이 꽉찼다)
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify(); // 기다리고 있는 손님을 깨우기 위해서
		System.out.println("Dishes : "+dishes.toString());
	}
	
	public void remove(String dishName) { // boolean -> void // 음식 소비
		synchronized (this) {
			String name = Thread.currentThread().getName();
			while (dishes.size() == 0) { // 음식이 없으면
				System.out.println(name +" is waiting...");
				try {
					wait(); // 손님 락 반납
					Thread.sleep(500);
				} catch(InterruptedException e) {}		
			}
			
			while (true) { // 음식이 있으면
				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i); // 음식 소비
						notify(); // 요리사에게 통보 (음식 먹었다고~)
						return ;
					}
				}
				try {
					System.out.println(name + " is waiting..!");
					wait();
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
		}
	}
	
	public int dishNum() {return dishNames.length;}
}

public class ex13_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		try{Thread.sleep(2000);} catch(InterruptedException e) {}
		
		System.exit(0);
	}
}
