package p124;
/*
 * ��¥ : 2020/11/05
 * �̸� : ���ϸ�
 * ���� : �迭 ���� p124
 */
public class ArrEX13 {
	public static void main(String[] args) {
		//���� �迭
		int[] arrInt = {1,2,3};
		
		//������ �迭
		int[] arrInt2 = new int[5];
		
		//������ �迭�� �� ����
		for(int i=0; i<arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		//�迭 �� ���
		for(int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}