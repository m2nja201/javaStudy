// 0216

public class b_langPack{
	public static void main(String [] args){
		int i = 5; // 기본형 타입 (객체&참조형이 아니다)
		Integer i2 = new Integer(5); // int를 객체로 바꿔주는 Wrapper 클래스 중 하나
		
		Integer i3 = 5; // 오토박싱 : 위에처럼 new를 사용하지 않아도 사용할 수 있다
		// 자동으로 new Integer(5) 처럼 인식
		
		int i4 = i3; // 오토 언박싱 : intValue()를 사용하지 않아도 오토 언박싱해줌
	}	
}