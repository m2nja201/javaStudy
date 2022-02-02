// 0202 - 0203

// 깨달은 점 : string에서 글자를 빼는 함수는 subString(i, i+1), 코드를 너무 복잡하게 작성하면 오류가 날 확률이 높아지므로 끊어서 정리하기

public class method2{
	// 음 toUpperCase를 for문으로 만들어보기
	
	public static String capitalMethod(String str){
		int temp;
		String s1 = "";
		
		if ((int)(str.charAt(0))>=97 && (int)(str.charAt(0))<=122){
			for (int i=0; i<str.length(); i++){
				temp = (int)str.charAt(i)-32;
				s1 += (char)temp;
			}
		}
				
		return s1;
	}
	
	public static void main(String [] args){
		String initStr = "korea";
		System.out.println("원래 문자 : "+initStr+"	바뀐 문자 : "+capitalMethod(initStr));
	}
}