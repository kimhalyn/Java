package p126;

import java.util.Arrays;

/*
 * ��¥ : 2020/11/05
 * �̸� : ���ϸ�
 * ���� : �迭 ���� p126
 */
public class ArrEx15 {
	public static void main(String[] args) {
		
		//���� �迭
		int[] arrInt = {1,2,3};
		
		//������ �迭
		int[] arrInt2 = null;
		
		arrInt2 = Arrays.copyOf(arrInt, 5);
		
		//�迭 �� ���
		for (int i =0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
