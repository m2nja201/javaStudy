// 0218
// thread

class MyThread extends Thread{
	String str;
	public MyThread(String str){
		this.str = str;
	}
	
	@Override
	public void run(){
		for (int i = 0; i<10; i++){
			System.out.println(str);
			
			try{
				Thread.sleep((int)Math.random()*1000); // 이 시간동안 잠깐만 쉽시다!
			} catch(Exception e){}
			
		}
	}
}

public class a_thread{
	public static void main(String[] args){
		MyThread t1 = new MyThread("*");
		MyThread t2 = new MyThread("-");
		
		// start라는 메서드를 써야 thread가 정상 동작됨
		t1.start();
		t2.start();
		
		System.out.println("main thread end!");
	}
}