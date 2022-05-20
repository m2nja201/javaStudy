import java.util.Arrays;

public class ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5]; // 배열 선언과 동시에 생성
		
		int tmp = 20;
		for (int i=0; i<score.length; i++) {
			score[i] = tmp;
			tmp += 20;
		}
		
		System.out.println(score); // 주소값
		
		char[] chArr = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(chArr);
		
		System.out.println(Arrays.toString(score));
	}
}
