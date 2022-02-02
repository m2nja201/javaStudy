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
		
		// 2차원 배열
		String [][] asia = {{"한", "중", "일"}, {"태", "베", "필"}};
		System.out.println(asia[0][0]);
		
		for (int i=0;i<asia.length; i++){
			for (int j=0; j<asia[i].length; j++){
				System.out.print(asia[i][j]+"   ");
			}
			System.out.println("\n");
		}
		
		
		// charAt() 메서드 사용 => 해당 인덱스에 있는 값을 반환 => 단어를 char 배열에 한글자씩 저장할 수 있음
		String[] strAt = {"some", "water", "please"};
		System.out.println(strAt[1].charAt(2)); // water의 t를 출력하는 것
		System.out.println("------------");
		
		for (int k=0; k<strAt.length; k++){
			for (int z =0; z<strAt[k].length(); z++){
				System.out.print(strAt[k].charAt(z)+" ");
			}
		}
	
	}
}