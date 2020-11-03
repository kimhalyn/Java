package p94;
/*
 * 날짜 : 2020/11/04
 * 이름 : 김하린
 * 내용 : p94
 */
public class DoWhile {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while (i <=100);
		System.out.println("합계 : "+sum);
	}
}
