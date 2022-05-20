public class ex5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 100, 100},
				{20, 40, 100},
				{30, 90, 80},
				{40, 88, 76}
		};
		
		float avr = 0;
		
		for (int i = 0; i <score.length; i++) {
			for (int j = 0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
				avr += score[i][j];
			}
			System.out.printf("average : %f\n\n", avr / (score[i].length));
			avr = 0;
		}
	}
}
