package p128;
/*
 * ��¥ : 2020/11/05
 * �̸� : ���ϸ�
 * ���� : ���� for�� p128
 */
public class ArrEX17 {
	public static void main(String[] args) {
		
		//�迭����
		String[] names = {"ȫ�浿", "�̼���", "������"};
		int[] scores = {90, 80, 100};
		
		int i=0;//�ε��� ����
		for(String name : names) {
			System.out.println(name + " : " + scores[i]);
			i++;
		}
	}
}
