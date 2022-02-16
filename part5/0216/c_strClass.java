// 0216
// string class

public class c_strClass{
	public static void main(String [] args){
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1); // substring을 사용했다 해서 str1이 바뀌진 않음
		System.out.println(str2); 
		
		String str3 = str1 + str2; // StringBuffer 객체가 생겨남
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		// 반복문에서 str에 str을 더할 때 마다 StringBuffer 객체는 하나씩 생기는 것 => 좋지 않은 코드
		// 애초에 StringBuffer sb = new StringBuffer();로 append 사용하면 ㄱㅊ
	}
}