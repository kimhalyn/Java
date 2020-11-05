package sub2;
/*
 * 날짜 : 2020/11/09
 * 이름 : 김하린
 * 내용 : 자바 클래스 실습하기 교재 p140
 * 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//국민은행 객체(Instance) 생성 및 초기화
		Account kb = new Account("국민은행", "123-11-5345", "김유신", 10000);

		//국민은행 객체 멤버초기화
		
		/* kb.bank = "국민은행"; 위에 new Account에 넣으므로 더이상 필요없음
		kb.id = "123-11-5345";
		kb.name = "김유신";
		kb.money = 10000; */
		
		//국민은행 객체 활용하기
		
		kb.deposit(15000);
		// kb.money++; 캡슐화 적용으로 취약코드 예방
		kb.withdraw(5000);
		kb.show();
		
		
		
		
		//우리은행 객체(Instance) 생성 및 초기화
		Account wr = new Account("우리은행", "1564-78-4454", "김춘추", 5000);
		
		//우리은행 객체 멤버초기화
		
		/*wr.bank = "우리은행";
		wr.id = "1564-78-4454";
		wr.name = "김춘추";
		wr.money = 5000; */
		
		//우리은행 객체 활용하기
		
		wr.deposit(10000);
		wr.withdraw(7000);
		// wr.money--; 캡슐화 적용으로 취약코드 예방
		wr.show();  
		
	}
}
