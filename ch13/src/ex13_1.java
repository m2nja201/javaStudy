
public class ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r= new ThreadEx1_2();
		Thread t2 = new Thread (r); // ������ Thread
		
		t1.start();
		t2.start();
	}

}

class ThreadEx1_1 extends Thread{ // Thread Ŭ������ ����ؼ� ������ ���� (����)
	public void run() { // �����尡 ������ �۾��� �ۼ�
		for (int i = 0; i< 5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{ // Runnable �������̽��� �����Ͽ� ������ ����(��õ)
	@Override
	public void run() { // �����尡 ������ �۾��� �ۼ�
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());;
	}
}