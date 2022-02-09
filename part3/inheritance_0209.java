// 0209
// 상속

public class inheritance_0209{
	public static void main(String [] args){
		animal kangaroo = new animal("kang", 3, 2);
		// kangaroo.flying(); => 기본 클래스의 객체가 파생 클래스의 메서드를 사용하는 것은 불가능
		kangaroo.info();
		kangaroo.moving();
		kangaroo.feeding();
		
		cat nabi = new cat("nabi", 5);
		nabi.info();
		nabi.moving();
		nabi.grooming();
		
		bird parrot = new bird("papa", 6);
		parrot.info();
		parrot.moving();
		parrot.flying();
		System.out.println("papa's gender : "+parrot.gender);
	}
}

class animal{
	int age;
	String name;
	int legs;
	String gender = "male";
	
	animal(String name, int age, int legs){
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	
	void feeding(){
		System.out.println(name+" is eating this food!");
	}
	
	void moving(){
		System.out.println(name+" is moving to you");
	}
	
	void info(){
		System.out.println("name : "+name+"  age : "+age+" years old   legs : "+legs);
	}
}

class cat extends animal {
	int age;
	String name;
	int legs = 4;
	
	cat (String name, int age){
		super(name, age, 4);
		this.name = name;
	}
	
	void moving(){  // 변경할 수 있음 (오버라이딩)
		System.out.println(name+" is moving for hunting a bird");
	}
	
	void grooming(){
		System.out.println("It's time for grooming");
	}
}

class bird extends animal {
	int age;
	String name;
	int legs = 2;
	
	bird (String name, int age){
		super(name, age, 2);
		this.name = name;
	}
	
	void flying(){
		System.out.println(name+" is flying");
	}
}