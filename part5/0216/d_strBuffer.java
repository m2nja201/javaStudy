// 0216
// 스트링버퍼

public class d_strBuffer{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // 문자열 추가
		sb.append("  ");
		sb.append("m2nja2");
		
		String str = sb.toString(); // string 값 받기
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("it's yellow"); // 즉 sb2도 바뀐다는 것
		
		if(sb2 == sb3){
			System.out.println("sb2 == sb3");
		}
		
		String str2 = new StringBuffer().append("it's blue").append("  ").append("real?").toString();
		// 계속해서 자신을 리턴하기 때문에 메서드를 계속 사용할 수 있음
		System.out.println(str2);
	}
}