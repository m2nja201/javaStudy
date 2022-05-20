import java.util.*;

public class Ex04_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int sum = 0;
		
		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum = %3d  /  num = %d\n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리 수의 합 : "+ sum);
	}

}
