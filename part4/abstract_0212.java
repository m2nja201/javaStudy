// 0212
// abstract

// 1. 추상 클래스는 객체를 생성할 수 없다.
// 2. 리턴 값 없이 메서드 명만 선언한다.
// 3. 추상 클래스 사용 : 상속 받아서 사용 (자식 클래스에서 해당 메서드를 오버라이딩하여 재정의 한 후 사용)

public class abstract_0212{
	public static void main(String [] args){
		Bird bird = new Bird();
		bird.run();
		bird.cry();
	}
}

abstract class Animal{
	abstract void run();
	void eat(){System.out.println("먹는 중..");} // 일반 메서드도 포함할 수 있다.
}

class Bird extends Animal{
	void run(){ // 여기서 재정의
		System.out.println("뛰는 중...");
	}
	void cry(){
		System.out.println("짹짹...!");
	}
}