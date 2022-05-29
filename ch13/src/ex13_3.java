
public class ex13_3 {
	static long startTime = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		th1.stime = System.currentTimeMillis();
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간 1 : " + (System.currentTimeMillis() - startTime));
		
	}

}

class ThreadEx3_1 extends Thread{
	static long stime;
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간 2 : " + (System.currentTimeMillis() - stime));
	}
}