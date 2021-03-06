// 0211
// 인터페이스

// 메인 클래스 (메인 메서드 포함)
public class interface_0211{
	public static void main(String[] args){
		Student s1 = new Student("김이나", 23, 45);
		s1.in(210000, "엄마");
		s1.out(2000, "꽃분이네 분식");
		s1.eat();
		s1.train(200000, "수학왕 학원");
		s1.study();
		s1.play();
		
		System.out.println("-------------");
		
		System.out.println(s1.intg); // 인터페이스 필드 접근 가능
		System.out.println(Allowance.str); // 객체 생성 없이 인터페이스 명으로 접근 가능
	}
}


// 부모 클래스
class Person{
	String name;
	int age;
	int weight;
	
	Person(){}
	Person(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void study(){System.out.println("공부하는 중...");}
	void eat(){System.out.println("먹는 중...");}
	void play(){System.out.println("노는 중...");}
}

// A 인터페이스 (부모)
interface Allowance{
	// 변수는 안되나 상수는 된다 => public static final 붙이기
	String str = "public ~ final은 생략도 가능하다 (알아서 해줌)";
	int intg = 100; 
	
	// 추상 메서드만 사용할 수 있다 => 하지만 public abstract 키워드를 지워도 알아서 컴파일 해준다
	abstract void in (int price, String name); 
	void out (int price, String name);
	// void wash(){System.out.~} 처럼 구현이 되어 있으면 안된다.
}

// B 인터페이스 (부모)
interface Train{
	// 추상 메서드만 사용할 수 있다
	abstract void train(int trainPay, String name);
}

// 자식 클래스
class Student extends Person implements Allowance, Train {

	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);
	}
	
	// 인터페이스에 적혀 있는 추상 메서드를 오버라이딩 해야한다
	public void in(int price, String name){System.out.printf("입금 : %s(%d)\n", name, price);}
	public void out(int price, String name){System.out.printf("출금 : %s(%d)\n", name, price);}
	public void train(int trainPay, String name){System.out.printf("학원비 결제 : %s(%d)\n", name, trainPay);}
}

