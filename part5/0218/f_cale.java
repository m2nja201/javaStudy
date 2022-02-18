// 0218
// 캘린더

import java.util.Calendar;

public class f_cale{
	public static void main(String [] args){
		Calendar cal = Calendar.getInstance(); // 를 통해 객체처럼 사용 가능
		System.out.println(cal.get(Calendar.YEAR)+" "+cal.get(Calendar.MONTH + 1));
		// MONTH에 1을 더해줘야 정확한 수가 나옴
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24시간 표시
		System.out.println(cal.get(Calendar.HOUR));
		
		cal.add(Calendar.HOUR_OF_DAY, 5); // 시간을 5시간 후로 가능
		System.out.println(cal.get(Calendar.HOUR));
	}
}