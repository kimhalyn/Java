package p123;
/*
 * ��¥ : 2020/11/05
 * �̸� : ���ϸ�
 * ���� : ������ �迭 p123
 */
public class ArrEx12 {
	
	public static void main(String[] args) {
		
		int[][] arrInt = new int[3][];
		
		arrInt[0] = new int[] {1};
		arrInt[1] = new int[] {2,3};
		arrInt[2] = new int[] {4,5,6};
		
		for (int i=0; i<arrInt.length; i++) {
			for(int j=0; j<arrInt[i].length; j++) {
				System.out.println(arrInt[i][j]);
			}
			System.out.println();
		}
		
	}

}
