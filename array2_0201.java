//0201

// Arrays.toString() 메서드 => 반복문을 사용하지 않고 배열의 값을 출력할 때 사용 (인자로는 배열명을 넣어줌)
// java.util.Arrays 임포트 선언이 무조건 되어있어야 한다.
import java.util.Arrays;

public class array2_0201{
	public static void main(String[] args){
		int[] arr = {12, 23, 34, 56, 78};
		
		System.out.println("메서드 출력 : " + Arrays.toString(arr));
		
		System.out.print("\n반복문 출력: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}
}