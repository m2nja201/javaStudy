// 0211
// 클래스 형변환

public class class_0211{
	public static void main(String [] args){
		Car c = new Bus(); // 부모 타입으로 자식 객체를 참조
		c.run();  // 부모의 메서드만 사용 가능
		// c.BBang();  => 자식의 메서드는 사용할 수 없다
		
		Bus b = (Bus)c; // c를 자식 타입으로 바꿈
		// 만약 Car c = new Car였다면 (Bus)를 이용해서 바꿀 수 없었음 => 원래 Bus였기에 Bus로 바꿀 수 있다
		b.run();
		b.BBang();
	}
}

class Bus extends Car{
	public void BBang(){
		System.out.println("빵빵!!");
	}
}

class Car{
	public void run(){
		System.out.println("달리는 중...");
	}
}