package p63;
/*
 * ��¥ : 2020/11/03
 * �̸� : ���ϸ�
 * ���� : ������ �ǽ��ϱ� ���� p63
 */
public class OpEX5_2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//& ����
		System.out.println(a == b & test());
		
		//&& ����
		System.out.println(a == b && test());
	}
		public static boolean test() {
			System.out.println("test()�޼��� �����");
			return true;
		}
	
	
}
