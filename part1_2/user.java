// 0201 - 0202

import java.util.Scanner;

public class user{
	public static void main(String [] args){
		
		// 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 갯수를 입력해라 : ");
		int R = sc.nextInt();   // int로 받으려면 객체.nextInt 사용
		
		System.out.print("\n열의 갯수를 입력해라 : ");
		int C = sc.nextInt();
		
		char[][] arr = new char[R][C];
		// 사용자 입력을 받아 저장할 배열 => 크기는 R
		String[] str = new String[R];
		
		for (int i=0; i<R; i++){
			System.out.print(i+"행에 입력할 문자 차례대로 입력 : ");
			str = sc.next();
			for (int j=0; j<C; j++){
				arr[i][j] = str[i].charAt(j);
			}
		}
	}
}