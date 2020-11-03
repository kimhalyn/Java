package p61;
/*
 * 날짜 : 2020/11/03
 * 이름 : 김하린
 * 내용 : 연산자 실습하기 교재 p61
 */
public class OpEX5 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//and 연산
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		//or 연산
		System.out.println(a > b || a == b);
		System.out.println(a < b || a == b);
		
		//xor 연산
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		//NOT 연산
		System.out.println(!(a > b));
		System.out.println(!(a < b));
		
	}

}
