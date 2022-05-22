import java.util.ArrayList;

public class ex09_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 원래는 객체만 저장할 수 있는데, 오토박싱 덕분에 list.add(new Integer(100)); 을 쓴 것 처럼 사용할 수 있다.
		Integer i = list.get(0);
		System.out.println(i);
	}
}
