package p222;

public class FinalMethod {
	//������ ������ �޼���
	void method() {
		
	}
	
	//�����ǰ� �Ұ����� �޼���
	final void fimalMethod() {
		
	}
}

class SubFinalMethod extends FinalMethod {
	
	void method() { //������ ����
		System.out.println("method() ������");
	}
	void finalMethod() { //������ �Ұ�
		System.out.println("finalMethod() ������");
	}
	
}