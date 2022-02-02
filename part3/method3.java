// 0202- 0203

public class method3{
	public void func1(){
		System.out.println("this is non static function");
	}
	
	public static void main(String [] args){
		method3 object = new method3();
		object.func1();
		
	}
}