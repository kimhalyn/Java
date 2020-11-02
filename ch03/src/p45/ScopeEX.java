package p45;
/*
 * 날짜 : 2020/11/02
 * 이름 : 김하린
 * 내용 : 교제 p45 변수의 범위
 */
public class ScopeEX {

	int no;
	
	public static void main(String[] args) {
		String name;
		
		if (true) {
			name = "홍길동";
			
			String email = "hong@test.com";
		}
		
		// if문 블럭 밖에서 email변수를 사용하면 에러 발생
		// email = "hong@test.com";		
	}
}
