// 0218
// thread - 인터페이스 사용

class MyTread2 implements Runnable{
	String str;
	public MyTread2(String str){
		this.str = str;
	}	
	
	@Override
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println(str);
		}
		
		try{
			Thread.sleep((int)Math.random()*1000);
		} catch(Exception e){}
	}
}
// 단일 상속만 가능하니까 다른 클래스 상속 받고 있다면 Runnable 인터페이스를 구현하면 됨
public class b_thread{
	public static void main(String [] args){
		MyTread2 t1 = new MyTread2("**");
		MyTread2 t2 = new MyTread2("--");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		// start라는 메서드 바로 사용 불가
		
		System.out.println("main end");
	}
}