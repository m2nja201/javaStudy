// 0215
// 익명 클래스

public class innerClass2_0215{
	public static void main(String [] args){
		// 원래 같다면
		// Action act = new myAction();
		// act.exec();
		
		Action act = new Action() {
			@Override
			public void exec(){
				System.out.println("exec");
			}
		};  // 익명 클래스 (이름 없는 객체를 만든다) - 추상 클래스를 상속받는 클래스를 굳이 만들 필요가 없을 때 사용
		act.exec();
	}
}

abstract class Action{
	public abstract void exec();
}

class myAction extends Action{
	public void exec(){
		System.out.println("exec");
	}
}