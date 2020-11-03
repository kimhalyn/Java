package p63;
/*
 * 날짜 : 2020/11/03
 * 이름 : 김하린
 * 내용 : 연산자 실습하기 교재 p63
 */
public class OpEX5_2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//& 연산
		System.out.println(a == b & test());
		
		//&& 연산
		System.out.println(a == b && test());
	}
		public static boolean test() {
			System.out.println("test()메서드 실행됨");
			return true;
		}
	
	
}
