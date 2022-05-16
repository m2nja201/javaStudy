
public class Rounding {
	public static void main(String[] args) {
		double pi = 3.141592;
		int shortPi = (int)Math.round(pi);
		System.out.println(shortPi); // 3
		System.out.println((double)Math.round(pi*1000)/1000); // 3.142
		// 3.141을 얻으려면
		System.out.println((int)(pi*1000)/1000.0);
	}
}
