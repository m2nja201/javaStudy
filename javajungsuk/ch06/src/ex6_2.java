class Data {int x;}
public class ex6_2 {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		System.out.println("main() : x = "+data.x);
		
		change(data.x);
		System.out.println("after change()");
		System.out.println("main() : x = "+data.x);
		
		refChange(data);
		System.out.println("after refchange()");
		System.out.println("main() : x = "+data.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = "+ x);
	}
	
	static void refChange(Data d) {
		d.x = 1000;
		System.out.println("refchange() : x = "+d.x);
	}
}

