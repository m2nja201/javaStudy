public class test2{
	public static void main(String [] args){
		
	}

}

interface Moveable{
	int move();
	int stop();
}

class Ball implements Moveable{
	public int move(){
		System.out.println("움직");
	}
	public int stop(){
		System.out.println("멈춰!");
	}
}