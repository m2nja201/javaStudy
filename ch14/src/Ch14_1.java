
public class Ch14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object obj = (a, b) -> a > b ? a : b // 람다식 (익명 객체)
				
		// 같은 내용으로
		/*
		MyFunc f = new MyFunc() {
			
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a :b;
			}
		}*/
		
		MyFunc f = (a, b) -> a > b ? a : b;
		
		int val = f.max(3, 5); // 함수형 인터페이스가 필요
		System.out.println("value = "+val);
	}

}

@FunctionalInterface // 하나의 추상 메서드만 있어야 하므로 이 문장을 적어주면 추상 메서드가 하나 더 있을 때 에러 표시해줌
interface MyFunc{
	public abstract int max(int a, int b);
}