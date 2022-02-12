// 0213
// algorithm
import java.util.Arrays;

public class algo1_0213{
	public static void main(String [] args){
		int[] ar = new int[10];
		
		for (int i=0; i<ar.length; i++){
			ar[i] = (int)(Math.random()*100); // Math.random()은 0점대
		}
		
		System.out.println(Arrays.toString(ar));
		
		// 반복문 이용하여 최댓값, 최솟값 찾기
		int max = Integer.MIN_VALUE; // integer 중에 가장 작은 값으로 저장
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<ar.length; i++){
			max = Math.max(ar[i], max);
			min = Math.min(ar[i], min);
		}
		System.out.println("max : "+max+"  min : "+min);
	}
}