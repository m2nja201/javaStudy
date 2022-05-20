package com.codechobo.book;

public class ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine f = new FireEngine();
		Car car = (Car)f;
		
		//Car cc = new Car();
		//FireEngine f2 = (FireEngine)cc;
		
		f.water();
		car.drive();
		//f2.water(); // error
	}
}

class Car {
	String colorString;
	int door;
	
	void drive() {
		System.out.println("drive !");
	}
	
	void stop() {
		System.out.println("stop !");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water !");
	}
}