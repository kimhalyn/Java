package p322;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}
