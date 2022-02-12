// 0212

public class poly2_0212{
	public static void main(String [] args){
		// 추상 - 다형성
		// Car c1 = new Car(); 추상 클래스는 객체를 생성할 수 없지만
		//Car c2 = new SportsCar();  // SportsCar의 객체로 생성해주면 가능!
		
		Car[] cars = new Car[2];
		cars = new Car[] {new Ambulance(), new SportsCar()};
	}
}

// abstract class Car{
	// abstract void run();
// }

class Car{
	void run();
}

class SportsCar extends Car{
	void run(){
		System.out.println("overidding");
	}
}

class Ambulance extends Car{
	void run(){
		
	}
}