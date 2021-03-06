// 0202- 0203

public class method3{
	public void func1(){
		System.out.println("this is non static function");
	}
	
	public static void func2(int a){  // call by value (값에 의한 호출)
		a += 400;
		System.out.println(a);
	}
	
	public static void func3(TestNumber a){ // call by reference
		a.num += 400;
		System.out.println("func3() 안에서의 출력: "+a.num);
	}
	
	public static void main(String [] args){ 
		//  method3 object = new method3();
		// object.func1();
		
		// int a=100;
		// func2(a);
		// System.out.println("local a is "+a);
		
		// Integer b = new Integer(100); // new로 객체 생성 => 즉, new를 쓰면 주소값을 반환할 수 있음
		
		TestNumber test = new TestNumber(100);
		func3(test); // 주소값에 의해서 함수를 호출함
				
		System.out.println("call by reference : "+ test.num);
	}
	
}

class TestNumber{
	int num;
	TestNumber(int num){this.num = num;} // 생성자
	
}