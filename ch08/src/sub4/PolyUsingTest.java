package sub4;
/*
 * ��¥ : 2020/11/11
 * �̸� : ���ϸ�
 * ���� : ������ Ȱ�� �ǽ��ϱ�
 */

public class PolyUsingTest {
	public static void main(String[] args) {
		
		Tiger TIger = new Tiger();
		Eagle Ealge = new Eagle();
		Shark Shark = new Shark();
		
		
		Animal animal[] = {TIger, Ealge, Shark};
		
		
		animal [0].move();
		animal [0].hunt();
		
		animal [1].move();
		animal [1].hunt();
		
		animal [2].move();
		animal [2].hunt();
		
	}
}
