// 02/01

public class array0201{
	public static void main(String[] args){
		int[] scores = new int[5];
		int size = scores.length;
		
		
		for (int i=0; i<size; i++){
			scores[i] = i*2+1;
		}
		
		for (int j=0; j<size; j++){
			System.out.print(scores[j]+"  ");
		}
	}
}