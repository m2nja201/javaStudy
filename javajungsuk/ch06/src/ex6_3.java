
public class ex6_3 {
	public static void main(String[] args) {
		myMath mm = new myMath();
		
		System.out.println("add(3, 3L) - "+mm.add(3, 3L));
		System.out.println("add(3, 3) - "+mm.add(3, 3));
	}
	
}

class myMath{
	long add (int a, long b) {
		System.out.print("long add(int a, long b) : ");
		return (a+b);
	}
	
	int add (int a, int b) {
		System.out.print("int add(int a, int b) : ");
		return (a+b);
	}
}