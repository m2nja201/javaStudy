import java.util.ArrayList;

public class ex09_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // ������ ��ü�� ������ �� �ִµ�, ����ڽ� ���п� list.add(new Integer(100)); �� �� �� ó�� ����� �� �ִ�.
		Integer i = list.get(0);
		System.out.println(i);
	}
}
