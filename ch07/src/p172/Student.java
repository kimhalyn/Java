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
	}  3�� �����ڿ� �ߺ���. �ֳĸ� �Ű��������� �ٸ����� �Ű����� Ÿ�԰� ������ ������ ������ */
}
