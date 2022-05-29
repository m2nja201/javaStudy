
public class ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r= new ThreadEx1_2();
		Thread t2 = new Thread (r); // 생성자 Thread
		
		t1.start();
		t2.start();
	}

}

class ThreadEx1_1 extends Thread{ // Thread 클래스를 상속해서 쓰레드 구현 (비추)
	public void run() { // 쓰레드가 수행할 작업을 작성
		for (int i = 0; i< 5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{ // Runnable 인터페이스를 구현하여 쓰레드 구현(추천)
	@Override
	public void run() { // 쓰레드가 수행할 작업을 작성
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());;
	}
}