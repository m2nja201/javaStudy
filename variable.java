//1.26.
// public class variable{
	// public static void main(String[] args){
		
		// System.out.println("byte:"+Byte.BYTES+"(바이트)-->"+Byte.SIZE+"(비트)\t"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		// System.out.println("Character:"+Character.BYTES+"(바이트)-->"+Character.SIZE+"(비트)\t"+(int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
	// }
// }

//1.27
public class variable{
	public static void main(String[] args){
		int a;
		int b; int c=90;  // 나란히 적어도 됨
		double d;
		char e;
		
		// b는 초기화되지 않았기 때문에 println을 했을 때 에러가 생김 => 초기화 해주기
		b = 3;
		a = 10;
		d = 10; // double도 정수로 적을 수 있지만, 10.0으로 올바르게 작성해주기
		e = 'A'; // 글자가 하나인 경우 작은 따옴표로 적어주기
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("---------------\n");
	}
}

