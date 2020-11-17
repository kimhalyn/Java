package p334;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateformatEx2 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2020-06-13";
		
		
		Date d = null;
		try {
			d=sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E����");
		System.out.println(sf2.format(d));
	}
}
