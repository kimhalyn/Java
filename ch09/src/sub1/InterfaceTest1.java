package sub1;
/*
 * ��¥ : 2020/11/12
 * �̸� : ���ϸ�
 * ���� : �������̽� �ǽ��ϱ� ���� p228
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		//�������̽� - Ŭ���� ������ ǥ�� ���̵带 ����
		RemoteControl lg = new RemoteLg();
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		RemoteControl Samsung = new RemoteSamsung();
		Samsung.powerOn();
		Samsung.chDown();
		Samsung.powerOff();
		
	}
}
