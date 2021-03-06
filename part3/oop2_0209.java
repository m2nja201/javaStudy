// 0209

public class oop2_0209{
	public static void main(String [] args){
		int a = 1;
		int b=2;
		int c = a+b;
		System.out.println("정수끼리의 연산 : a+b = "+c);
		
		String a1 = "1";
		String b1 = "2";
		String c1 = a1+b1;
		System.out.println("문자열끼리의 연산 : a+b = "+c1);
		
		// 문자열 => 숫자
		int a2 = Integer.parseInt(a1);
		/*parseInt 메서드는 인자 값을 두 개 받을 수도 있음
		즉, ("1000", 2) => 1000이라는 문자열을 2진수 숫자로 변환*/
		int b2 = Integer.valueOf(b1); // 이걸로도 가능
		
		System.out.println(a2+b2);
		
		System.out.println(Integer.parseInt("1000", 2));  // 8
		System.out.println(Integer.parseInt("1001", 2)); // 9
		System.out.println(Integer.parseInt("1004", 8));  // 516
		System.out.println(Integer.parseInt("FF", 16)); // 255 = 15*16 + 15*1 = 255
	}
}