import java.util.*;

public class Ex04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score < 50)
			System.out.println("fail");
		else if (score < 70)
			System.out.println("study harder");
		else {
			System.out.println("good!");
		}
	}

}
