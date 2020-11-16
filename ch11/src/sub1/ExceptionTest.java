package sub1;

/*
 * 날짜 : 2020/11/16
 * 이름 : 김하린
 * 내용 : 예외처리 실습하기 교제 p264
 */
public class ExceptionTest {
	public static void main(String[] args) {

		
			int num1 = 1;
			int num2 = 0;
			int r1 = 0;
			int r2 = 0;
			int r3 = 0;
			int r4 = 0;

			try {
				//에러가 발생할 가능성이 있는 로직
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		} catch (Exception e) {
			//에러가 발생했을 때 처리할 로직
			e.printStackTrace();
		}

		// num2가 0이면 여기서 에러가 생김. try 안에서 선언함으로서 에러가 발생했음에도 결과값이 인출되도록 작성

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);

		System.out.println("프로그램 종료...");
	}
}
