
public class ex6_1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Tv t2 = new Tv();
		t.channel = 7;
		t2.channel = 14;
		t.up();
		System.out.println("t1 now : "+ t.channel);
		System.out.println("t2 now : " + t2.channel);
		t.down();
		t2 = t;
		System.out.println("t1 now : "+ t.channel);
		System.out.println("t2 now : " + t2.channel);
		
		System.out.println("======================");
	}
}

class Tv {
	String colorString;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void up() {++channel;}
	void down() {--channel;}
}