
public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5]; // 배열 선언과 동시에 생성
		
		int tmp = 20;
		for (int i=0; i<score.length; i++) {
			score[i] = tmp;
			tmp += 20;
		}
		
		for (int j=0; j<score.length; j++) {
			System.out.println(score[j]);
		}
		
		System.out.println("score's length : "+score.length);
	}

}
