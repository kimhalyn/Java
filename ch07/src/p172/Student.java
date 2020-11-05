package p172;

public class Student {

	String name;
	int grade;
	String department;
	
	Student() {
		
	}
	
	Student(String n) {
		name = n;
	}
	
	Student(String n, int g) {
		name = n;
		grade= g;
	}
	
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	/*Student(String d, int g) {
		department = d;
		grade = g;
	}  3번 생성자와 중복됨. 왜냐면 매개변수명은 다르지만 매개변수 타입과 순서가 완전히 동일해 */
}
