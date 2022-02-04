// 0202- 0203

public class method3{
	public void func1(){
		System.out.println("this is non static function");
	}
	
	public static void func2(int a){  // call by value (값에 의한 호출)
		a += 400;
		System.out.println(a);
	}
	
	public static void func3(method3 a){
		System.out.println("func3() 안에서의 출력: "+a);
	}
	
	public static void main(String [] args){
		method3 object = new method3();
		object.func1();
		
		int a=100;
		func2(a);
		System.out.println("local a is "+a);
		
		method3 b = new method3(); // new로 객체 생성 => 즉, new를 쓰면 주소값을 반환할 수 있음
		System.out.println("call by reference : "+b);
	}
	
}