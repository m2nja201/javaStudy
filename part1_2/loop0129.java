// 01/29
// 이 part도 c++이랑 비슷

public class loop0129{
	public static void main(String [] args){
		/* (1)!! ======================
		int for_temp = 0;
		
		for (int i=0; i<10; i++){
			for_temp += i;
		}
		System.out.println("i=0~9의 sum : "+for_temp);
		System.out.println("----------------------");
		
		// (2)! ================
		// ASCII A=65
		char alpha = (char)65;
		System.out.println("first = "+alpha);
		for (int k=0; k<26; k++){
			System.out.print((char)(alpha+k)+" ");
		}
		*/
		
		// (3)! ===================
		int num = 1;
		System.out.print("1~30의 짝수 : ");
		while(num<=30){
			if (num%2 == 0) System.out.print(num+"  ");
			num++;
		}
		
	}
}