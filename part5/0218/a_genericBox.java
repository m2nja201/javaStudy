// 0218
// generic

public class a_genericBox{
	public static void main(String[] args){
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("hello"); // Object가 최상위 클래스이기 때문에 모든 타입이 다 들어갈 수 있음
		// box.getObj(); // reference하는 타입은 Object타입 -> 문자열이 Object 타입으로 return
		String str = (String)box.getObj();
		// String으로 사용하고 싶다면 형변환
		System.out.println(str);
		
		box.setObj(25);
		int value = (int)box.getObj(); // 매번 형변환을 해야 사용가능 -> generic 이용하면 ㄱㅊ
		
		a_Box<Integer> boxx = new a_Box<>();
		boxx.setObj(45);
		int intobj = boxx.getObj();
		System.out.println(intobj);
	}
}

class Box{
	private Object obj;
	public void setObj(Object obj){
		this.obj = obj;
	}
	
	public Object getObj(){
		return obj;
	}
}

class a_Box<E>{ // E는 실제로 존재하는 클래스는 아님
	private E obj;
	public void setObj(E obj){
		this.obj = obj;
	}
	
	public E getObj(){
		return obj;
	}
}