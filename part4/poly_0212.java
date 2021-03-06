// 0212
// 다형성

public class poly_0212{
	public static void main(String [] args){
		Student s1 = new Student("자타 자객"); // 파생 클래스 인스턴스가 파생 클래스 객체로 사용
		// 부모 자식 클래스의 모든 자원 사용 가능
		s1.walk();
		s1.gotoschool(); //둘 다 가능
		s1.walk_non(); // super.walk(); 를 이용해 오버라이딩 메서드 원본 메서드 사용
		
		
		Person p1 = new Student("부타 자객"); // 파생 클래스 인스턴스가 기본 클래스 객체로 사용
		// 부모 클래스의 자원만 사용 가능
		p1.walk(); // 오버라이딩 되는 것을 보아하니 오버라이딩 된 메서드는 접근 가능
		// p1.gotoschool(); // 자식 인스턴스가 사용된 부모 타입 객체는 부모 클래스만
		// 사용하고 싶다면!
		((Student)p1).gotoschool();
		
		
		Person p2 = new Person("부타 부객");
		// 부모 클래스의 자원만 사용 가능
		
		
		// Student s2 = new Person(); // 기본 클래스 인스턴스가 파생 클래스 객체로 사용 불가! (X)
	}
}

class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	
	void walk(){
		System.out.println(name+"가 걷는다!");
	}
}

class Student extends Person{
	String str = "이것은 자식 클래스의 str";
	
	Student(String name){
		super(name);
	}
	
	void walk_non(){ // !!!
		super.walk();
	}
	
	void walk(){
		System.out.println(name+"가 걷고있는 중! (오버라이딩)");
	}
	
	void gotoschool(){
		System.out.println(name+"은 학교로 가는 중!");
	}
}