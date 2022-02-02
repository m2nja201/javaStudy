//1.27
// c++이랑 비슷하니까 후다닥 공부하기
/* public class operator{
	public static void main(String [] args){
		int a = 60, b = 8;
		int rst1 = a/b;
		float rst2 = a/b;  // double도 마찬가지
		
		System.out.println(rst1);
		System.out.println((double)rst1); // double로 바꿔줘도 int값이었을 때랑 동일한 값이 나옴 => 7.5(x)
		System.out.println(rst2);  // float 형으로 받아준다해도 /연산자는 몫을 나타내기 때문에 7.0
		
		int c = 30;
		double d = 7.0;
		double rst3;
		rst3 = c/d;
		System.out.println(rst3);  // 실수형과 정수형으로 같이하게 되면 실수로 인정되어 소숫점까지 나옴
	}
} */

// 관계 연산자
/* public class operator{
	public static void main(String [] args){
		int kor=100, eng=90, math=100;
		boolean bo1, bo2, bo3, bo4, bo5, bo6;
		
		bo1=kor == eng; // false
		bo2=kor != eng; // true
		bo3=kor > math; // false
		bo4=kor >= math; // true
		bo5=eng < math; // true
		bo6=kor <= math; //true
		
		System.out.printf("%b %b %b %b %b %b", bo1,bo2,bo3,bo4,bo5,bo6);
	}
} */

// 논리 연산자
public class operator{
	public static void main(String [] args){
		int A = 30, B = 35, C = 35;
		
		if ((A<B) && (B==C))
			System.out.println("it is true");
		
		if ((A==C) && (B==C))
			System.out.println("it is true 2");
		else System.out.println("it is false 2");
		
		if ((A<C) || (B!=C))
			System.out.println("it is true 3");
	}
}