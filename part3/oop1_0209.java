// 0209

public class oop1_0209{
	public static void main(String [] args){
		farmMachine fm = new farmMachine(); // 객체 생성
		
		fm.price = 20000000;
		fm.year = 3;
		fm.color = "red";
		
		String fm_price = String.format("%,d", fm.price); // 1000단위로 콤마(,)를 찍어서 출력
		
		System.out.println(fm_price);
		fm.move();
		fm.digging();
		fm.selling();
		
	}
}

class farmMachine{
	int price;
	int year;
	String color;
	
	void move(){
		System.out.println("Farm machine is moving!");
	}
	
	void digging(){
		System.out.println("Farm machine is digging!");
	}
	
	void selling(){
		System.out.println("This machine info : "+year+"years  "+"price : "+price+"$  color : "+color);
	}
}