import java.util.*;

public class ex10_1 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK
			= {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d1.set(2019, 3, 29);
		System.out.println("d1은 "+ toString(d1) + DAY_OF_WEEK[2] + "요일이고,");
		
		long difference = 
				(d2.getTimeInMillis() - d1.getTimeInMillis())/1000;
		System.out.println("d1부터 d2까지 "+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면" + difference/(24*60*60) + "일 입니다.");
	}
	
	static String toString(Calendar d) {
		return (d.get(Calendar.YEAR) + "년 "+ (d.get(Calendar.MONTH)+1) +"월 "+ d.get(Calendar.DATE)+"일");
	}
}
