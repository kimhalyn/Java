package p113;
/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 배열사용 p113
 */
public class ArrEx8 {
	public static void main(String[] args) {
		
		int[] number = new int[100];
		
		for(int i=0; i<number.length; i++) {
			number[i] = i+1;
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
