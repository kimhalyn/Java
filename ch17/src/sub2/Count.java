package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//����ȭ�� �������� �����尣 ������ ���´�.(=�ټ���� �Ŵ�)
	public synchronized void setNum() {
		
		
		
		num++;
	}
	
}
