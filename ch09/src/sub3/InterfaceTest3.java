package sub3;
/*
 * ��¥ : 2020/11/12
 * �̸� : ���ϸ�
 * ���� : �������̽� �ǽ��ϱ� ���� p 228
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		//�������̽� - ��ü���� ���յ��� ��ȭ
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}	
}
