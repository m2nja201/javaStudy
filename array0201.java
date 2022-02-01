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
		
		System.out.println("\n-----------------------");
		
		// -------------------------------
		
		int[] arr = {1, 3, 6, 8, 10};
		int[] arr2 = new int[] {2, 4, 6,7, 9};
		
		for (int j=0; j<size; j++){
			System.out.print(arr[j]*arr2[j]+"  ");
		}
		
		double[] arr3 = {1.1 , 2.2 };
		System.out.println(arr +"    "+ arr3);
	}
}