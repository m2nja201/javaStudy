
public class ex13_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		th1.start();
		th2.start();
		
		delay(2000);
		System.out.println("<main 종료>");
	}
	
	// try, catch를 통해 예외처리 꼭 해줘야함.
	static void delay (long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}
}

class Thread8_1 extends Thread{
	public void run() {
	// TODO Auto-generated constructor stub
		for (int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println("<th1 종료>");
	}
}

class Thread8_2 extends Thread {
	public void run() {
		for (int i = 0; i< 300; i++) {
			System.out.print("-");
		}
		System.out.println("<th2 종료>");
	}
}