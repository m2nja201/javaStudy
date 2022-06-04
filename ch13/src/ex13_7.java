
public class ex13_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume();
			Thread.sleep(2000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
}

class MyThread implements Runnable {
	volatile boolean suspended = false; // volatile : 쉽게 바뀌는 변수
	volatile boolean stopped = false;
	
	Thread th;
	
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	void start() {th.start();}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = true;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stopped) {
			if (!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
			}
		}
	}
}