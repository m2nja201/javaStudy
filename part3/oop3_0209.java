// 0209
// 생성자

public class oop3_0209{  // public 키워드가 붙어있는 class가 파일명이어야 한다.
	public static void main(String [] args){
		Person minsu = new Person("minsu", 20);
		minsu.tell();
		minsu.info();
		
		Person saeron = new Person("saeron", 18);
		saeron.info();
	}
}

class Person{
	
	int age;
	String name;
	
	Person(String p_name, int p_age){
		this.name = p_name;
		this.age = p_age;
	}
	Person(){}; // 오버로딩 가능
	
	void tell(){
		System.out.println("Hello my name is "+name);
	}
	
	void info(){
		System.out.println("이름 : "+name+"  나이 : "+age);
	}
}
