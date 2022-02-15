// 0214
// interface의 default method

interface calculator{
	public int plus(int i, int j);
	public int mult(int i, int j); // interface 안에서는 구현을 하면 안됨
	
	default int modul(int i, int j){ // default - interface 안에서도 구현할 수 있도록 함
		return i%j;
	}
	
	public static int sub(int i, int j){  // static으로 할 시 interface_name.func();으로 사용
		return i-j;
	}
}

class myCal implements calculator{
	public int plus(int i, int j){
		return i+j;
	}
	
	public int mult(int i, int j){
		return i*j;
	}

}

public class interface_0214{
	public static void main(String [] args){
		myCal cal = new myCal();
		System.out.println(cal.plus(2, 3));
		System.out.println(cal.mult(2, 3));
		System.out.println(cal.modul(2, 3));  // 나오는 거 확인 => 2
		
		System.out.println(calculator.sub(2, 3));
	}
}