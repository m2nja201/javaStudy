
public class ex13_5 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ex13_5());
		t.setDaemon(true);
		t.start();
		
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println(i);
			if (i==5)
				autoSave = true;
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(3*1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			// autoSave의 값이 true이면 autoSave() 호출
			if (autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일 자동 저장 완료");
	}
}
