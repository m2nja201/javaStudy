
public class ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(0/0); // 발생 코드
			System.out.println(2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("cannot divide by 0");
			e.printStackTrace();
			System.out.println("message : "+e.getMessage());
		}
		System.out.println(3);
	}

}
