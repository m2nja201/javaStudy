import java.util.Arrays;

public class ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("num : " + Arrays.toString(num));
		
		for (int i=0; i<num.length; i++) {
			int n = (int)(Math.random() * 10); // 0~9 사이의 랜덤값
			int tmp = num[i];
			num[i] = num[n];
			num[n] = tmp; 
		}
		
		System.out.println("after mix : "+Arrays.toString(num));
	}
}
