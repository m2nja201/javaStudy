//1.27
public class dataType{
	public static void main(String[] args){
		short a = 'A';  // 정수형 변수로 선언되고 있기 때문에 A의 ASCII CODE 숫자가 출력됨
		System.out.println(a);
		
		short b = 90;
		System.out.println((char)b); // b가 char로 형변환 되는 것임 90에 해당하는 글자 => Z
		
		char c = 'a';
		System.out.println((short)c); // c가 short로 형변환 되는 것임
		
		int d = 22;
		System.out.printf("나는 %d살이다.\n", d);
		
		short num1 = 10;
		System.out.printf("10진수 10은 8진수로 %o이고, 16진수로는 %x이다.", num1, num1);
	}
}