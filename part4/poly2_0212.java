// 0212

public class poly2_0212{
	public static void main(String [] args){
		// 추상 - 다형성
		// Car c1 = new Car(); 추상 클래스는 객체를 생성할 수 없지만
		//Car c2 = new SportsCar();  // SportsCar의 객체로 생성해주면 가능!
		
		Car[] cars = {new Ambulance(), new SportsCar()};
		for (int i=0; i<cars.length; i++){
			cars[i].run();
		}
		
		// for문 업그레이드 버전
		System.out.println("-----------");
		for (Car i:cars){
			i.run();
		}
	}
}

abstract class Car{
	abstract void run();
}


class SportsCar extends Car{
	void run(){
		System.out.println("부아아앙");
	}
}

class Ambulance extends Car{
	void run(){
		System.out.println("삐용삐용");
	}
}