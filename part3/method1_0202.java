// 0202

public class method1_0202{
	public static void func1(){
		System.out.println("func1 : 반환값X, 인자값X");
	}
	
	public static void func2(int num){
		System.out.println("func2 : 반환값X, 인자값O => num : "+num);
	}
	
	public static int func3(int num1, int num2){
		return num1+num2;
	}
	
	public static int func4(){
		int func4_num = 450;
		return func4_num;
	}
	
	public static void main(String [] args){
		func1();
		func2(22);
		System.out.println("func3 : 반환값O, 인자값O => num1+num2 ="+func3(22, 28));
		System.out.println("func4 : 반환값O, 인자값X => initial number = "+func4());
		
	}
}