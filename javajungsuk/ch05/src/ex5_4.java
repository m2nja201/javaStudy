public class ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 90, 100, 95, 100};
		int sum = 0;
		float avr = 0;
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avr = sum / (float)score.length;
		
		System.out.println("total : "+sum);
		System.out.println("average : " + avr);
	}
}
