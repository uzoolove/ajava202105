package api;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		GregorianCalendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();	// 팩토리 메소드
		
		// 년월일 시분초
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(cal);
	}
}
