import java.util.*;

public class ex10_1 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK
			= {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d1.set(2019, 3, 29);
		System.out.println("d1�� "+ toString(d1) + DAY_OF_WEEK[2] + "�����̰�,");
		
		long difference = 
				(d2.getTimeInMillis() - d1.getTimeInMillis())/1000;
		System.out.println("d1���� d2���� "+difference+"�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ�" + difference/(24*60*60) + "�� �Դϴ�.");
	}
	
	static String toString(Calendar d) {
		return (d.get(Calendar.YEAR) + "�� "+ (d.get(Calendar.MONTH)+1) +"�� "+ d.get(Calendar.DATE)+"��");
	}
}
