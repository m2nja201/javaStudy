import java.util.ArrayList;

/*
1. ����ȭ�� ��Ų�� (������ ���� ��, �մ��� table�� lock�� ��� �ȳ��´� / �丮�簡 lock�� ���� ���� table�� ���� �߰��� �� ����)
2. wait()���� �մ��� lock�� Ǯ �� �ִ�.
3. �丮�簡 ������ �߰��ϸ� notify()�� �մԿ��� lock�� ��ȹ�� �� �� �ֵ��� �˸���. 

��, ������ �ȵ� (���� wait����)
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
	
	public synchronized void add(String dish) { // ���� �߰�
		while (dishes.size() >= MAX_FOOD) { // ������ ���� ����
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting...");
			try {
				wait(); // cook �����带 ��ٸ��� ��. (������ ��á��)
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify(); // ��ٸ��� �ִ� �մ��� ����� ���ؼ�
		System.out.println("Dishes : "+dishes.toString());
	}
	
	public void remove(String dishName) { // boolean -> void // ���� �Һ�
		synchronized (this) {
			String name = Thread.currentThread().getName();
			while (dishes.size() == 0) { // ������ ������
				System.out.println(name +" is waiting...");
				try {
					wait(); // �մ� �� �ݳ�
					Thread.sleep(500);
				} catch(InterruptedException e) {}		
			}
			
			while (true) { // ������ ������
				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i); // ���� �Һ�
						notify(); // �丮�翡�� �뺸 (���� �Ծ��ٰ�~)
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
