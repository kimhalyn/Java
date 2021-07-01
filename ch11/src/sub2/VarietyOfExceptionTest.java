package sub2;

/*
 * ��¥ : 2020/11/16
 * �̸� : ���ϸ�
 * ���� : �پ��� �������� �ǽ��ϱ� ���� p265
 */
public class VarietyOfExceptionTest {
	public static void main(String[] args) {

		// �迭�� �ε�����ȣ ���� ����
		int arr[] = new int[3];

		for (int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

		}

		for (int num : arr) {
			System.out.println("arr�� : " + num);
		}

		// NullPoint ����
		try {
			Tiger tiger = null;

			tiger.move();
			tiger.hunt();

		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// Casting ����
		try {
			Animal al = new Eagle(); // ��ĳ����(������)
			Animal a2 = new Shark(); // ��ĳ����(������)

			Eagle eagle = (Eagle) a2; // �ٿ�ĳ����

		} catch (ClassCastException e) {
			e.printStackTrace();
		}

		System.out.println("���α׷� ����...");

	}
}
