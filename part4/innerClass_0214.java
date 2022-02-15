// 0214
// 내부 클래스

public class innerClass_0214{
	class Cal{  // 중첩 클래스
		int value = 0;
		public void plus(){
			value++;
		}
	}
	
	
	static class Cal2{ // 정적 중첩 클래스
		int value = 0;
		public void sub(){
			value--;
		}
	}
	
	public void exec(){
		class Cal3{ // 지역 중첩 클래스 (메서드 안에서만 사용 가능)
			int value = 0;
			public void doublePlus(){
				value += 2;
			}
		}
		Cal3 cal3 = new Cal3();
		cal3.doublePlus();
		System.out.println(cal3.value);
	}
	
	
	public static void main(String [] args){
		// 중첩 클래스
		innerClass_0214 t = new innerClass_0214();  // 바깥 클래스 객체 먼저 생성 후
		innerClass_0214.Cal cal = t.new Cal();  // 바깥.내부타입 객체 = 바깥객체.new 내부(); 로 내부 클래스 객체 생성
		cal.plus();
		System.out.println(cal.value);
		
		// static 중첩 클래스
		innerClass_0214.Cal2 cal2 = new innerClass_0214.Cal2();
		cal2.sub();
		System.out.println(cal2.value);
		
		// 지역 중첩 클래스
		t.exec(); // 메서드가 불릴 때 class도 생성됨
	}
	
}
