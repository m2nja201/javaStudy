// 0218
// Date

import java.util.Date;
import java.text.SimpleDateFormat;

public class e_date{
	public static void main(String [] args){
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		// 월은 대문자로 a는 오전오후, zzz는 지역
		System.out.println(ft.format(date));
		
		System.out.println("--------------------");
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis(); // 현재 시간
		System.out.println(today);
		
		System.out.println(today - date.getTime()); // 위 코드에서 밑 코드까지 걸린 시간
	}
}