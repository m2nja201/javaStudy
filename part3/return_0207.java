// 0207
import java.util.Arrays;

public class return_0207{
	
	public static int[] test(){
		int num1 = 100;
		int num2 = 200;
		int sum = num1+num2;
		return new int[] {num1, num2, sum};  // 배열을 이용해서 여러 개의 값을 return해줌
	}
	
	public static void main(String[] args){
		
		// 변수 선언은 배열이어야 함. 메서드로부터 받을 값이 배열이기 때문임.
		int arg[] = test();
		
		System.out.println(Arrays.toString(arg));
	}
}