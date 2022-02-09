// 0207
// 강의하신 내용보다 더 구체적으로 대문자인지 소문자인지 구별하는 함수도 만들어보기!

import java.util.Arrays;

public class return_0207{
	
	public static int[] test(){
		int num1 = 100;
		int num2 = 200;
		int sum = num1+num2;
		return new int[] {num1, num2, sum};  // 배열을 이용해서 여러 개의 값을 return해줌
	}
	
	public static String[] capitalArr(String a, String b){
		
		a = capital(a);
		b = capital(b);
		return new String[] {a, b};
	}
	
	public static String capital(String ar){
		if (((int)ar.charAt(1)>=65) && ((int)ar.charAt(1) <=90)){
			ar = ar.toLowerCase();
		}
		else if (((int)ar.charAt(1)>=97) && ((int)ar.charAt(1) <=122)){
			ar = ar.toUpperCase();
		}
		return ar;
	}
	
	public static void main(String[] args){
		
		// 변수 선언은 배열이어야 함. 메서드로부터 받을 값이 배열이기 때문임.
		int arg[] = test();
		System.out.println(Arrays.toString(arg));
		
		String[] result = capitalArr("korea", "USA");
		System.out.println(Arrays.toString(result));
		
	}
}