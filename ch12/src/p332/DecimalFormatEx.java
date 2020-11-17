package p332;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double[] scores = {90.555, 80.666, 70.7777, 60.666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(df.format(scores[i]));
		}
	}
}
