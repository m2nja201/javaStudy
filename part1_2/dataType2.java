//01.27
public class dataType2{
	public static void main(String [] args){
		int a = 12345; // 얘의 length를 출력하면 error => no string
		String str = "12345";
		System.out.println("str의 크기"+str.length()); // 5
		
		String str_a = String.valueOf(a);
		System.out.println("a를 문자열로 바꿨을 때의 크기"+str_a.length()); // 5
		
		System.out.println("str+1 = "+str+1); // 123451
		
		int b = Integer.valueOf(str_a);
		System.out.println(b+1);
	}
}