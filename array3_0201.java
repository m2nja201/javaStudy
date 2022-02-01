//0201

import java.util.Arrays;

public class array3_0201{
	public static void main(String [] args){
		
		// 1차원 배열
		// string 참조형 변수 각 요소는 기본값(null)로 초기화
		String[] arr = new String[3];
		System.out.println(arr[0]);
		
		arr[0] = "java";
		arr[1] = "python";
		arr[2] = "c++";
		
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = {"black", "pink", "white"};
		System.out.println(Arrays.toString(arr2));
	}
}