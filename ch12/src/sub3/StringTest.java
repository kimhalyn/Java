package sub3;
/*
 * 날짜 : 2020/11/17
 * 이름 : 김하린
 * 내용 : String 클래스 실습하기 교재 p296
 */
public class StringTest {
	public static void main(String[] args) {
	
		//문자열 = 문자 + 배열
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		
		//문자열 객체생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; //literal 문자열
		String str4 = "Hello"; //literal 문자열

		//String문자열은 문자값이 아니라 주소값을 서로 비교한다
		if(str1==str2) {
			System.out.println("str1과 str2의 참조값(주소값)이 서로 같다.");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 서로 다르다.");
		}
		
		//literal 문자열은 서로 같은 주소를 가진다.
		if(str3==str4) {
			System.out.println("str3과 str4의 참조값(주소값)이 서로 같다.");
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 서로 다르다.");
		}
		
		
		
		//문자열 비교(equals 진짜 많이 쓰고 중요함)
		
		if(str1.equals(str4)) {
			System.out.println("str1과 str4의 문자열이 서로 같다.");
		}else {
			System.out.println("str1과 str4의 문자열이 서로 다르다.");
		}
	}
}
