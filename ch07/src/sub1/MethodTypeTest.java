package sub1;
/*
 * ��¥ : 2020/11/05
 * �̸� : ���ϸ�
 * ���� : �޼��� �ǽ��ϱ� ���� p155
 */
public class MethodTypeTest {
	public static void main(String[] args) {

		double rs1 = type1(1.01);
		System.out.println("rs1 : "+rs1);
		
		type2(true);
		type2(false);
		
		
		boolean rs2 = type3();
		System.out.println("rs2 : "+rs2);
		
		type4();
		
		//��������
		for(int i=2 ; i<=9 ; i++) {
			gugudan(i);
		}
		
	} //main ��
	
	//������ �޼��� ����
	public static void gugudan(int num) {
		
		System.out.println(num+ "��");
		for(int i=1 ; i<=9; i++) {
			int result = num * i ;
			System.out.println(num + " x " + i +" = " + result);
		}
	
	}
	
	//type1 : �Ű������� �ְ�0, ���ϰ��� �ִ�0 ����
	public static double type1(double a) {
		
		double result = a + 3.14;
		return result;
	}
	
	//type2 : �Ű������� �ְ�0, ���ϰ��� ����x ����
	public static void type2(boolean isOk) { //������ �ҹ��ڷ� ���� �� �ܾ �������� ù��°�� �빮�ڷ� ǥ��
		if(isOk) {
		System.out.println("�� �Դϴ�");
		}else {
			System.out.println("���� �Դϴ�");
		}
	}
	
	//type3 : �Ű������� ����x, ���ϰ��� �ִ�0 ����
	public static boolean type3() {
		
		int num1 =1;
		int num2 =2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	//type4 : �Ű������� ����x, ���ϰ��� ����x ����
	public static void type4() {
		System.out.println("type4 �޼��� ��� : "+type1(0.12));
		
	}
	
	
	
	
}
