package p127;
/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 향상된 for문 p127
 */
public class ArrEx16 {
	public static void main(String[] args) {
		
		//배열
		int[] arrInt = {1,2,3,4,5};
		
		//기존 for문을 이용한 출력
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		//향상된 for문을 이용한 출력
		for(int number : arrInt) {
			System.out.println(number);
		}
	}
}
