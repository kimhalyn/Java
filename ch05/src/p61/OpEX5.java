package p61;
/*
 * ��¥ : 2020/11/03
 * �̸� : ���ϸ�
 * ���� : ������ �ǽ��ϱ� ���� p61
 */
public class OpEX5 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//and ����
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		//or ����
		System.out.println(a > b || a == b);
		System.out.println(a < b || a == b);
		
		//xor ����
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		//NOT ����
		System.out.println(!(a > b));
		System.out.println(!(a < b));
		
	}

}
