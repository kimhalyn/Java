package p329;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx5 {

	public static void main(String[] args) {

		int sYear = 2020;
		int sMonth = 6;
		int sDay = 12;

		int eYear = 2020;
		int eMonth = 6;
		int eDay = 1;

		Calendar sCal = new GregorianCalendar(sYear, sMonth + 1, sDay);
		Calendar eCal = new GregorianCalendar(eYear, eMonth + 1, eDay);

		long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis()) / 1000;

		long diffDay = diffSec / (24 * 60 * 60);

		System.out.println(diffDay + "ÀÏ °æ°ú");
	}
}
