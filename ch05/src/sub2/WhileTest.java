package sub2;
/*
 * ��¥ : 2020/11/04
 * �̸� : ���ϸ�
 * ���� : �ݺ��� while �ǽ��ϱ� ���� p92
 */
public class WhileTest {
	public static void main(String[] args) {
		
		//1~10���� ��
		
		int k = 1;  		//�ʱ��
		int sum = 0;
		
		while(k <= 10) { 	//���ǽ�
			sum += k;
			k++; 			//������
			
		}

		System.out.println("1���� 10���� �� :"+sum);
		
		//do while : ���� �ѹ��� ������ �����ϴ� �ݺ���
		int esum = 0;
		int i = 1;
		
		do
		{
			
			if(i%2 == 0) {
				esum +=1;
			}
			
			
			i++;
		}
		while(i <= 10);  
		
		System.out.println("1���� 10���� ¦���� : "+esum);
		
		//break : �ݺ��� ����
		
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 ==0 && num % 7 ==0) {
				break;
			}
			
		}
		
			System.out.println("5�� 7�� �ּҰ���� : "+num);
		
		//continue : �ݺ����� ������ �̵�(=������ �̵��Ѵ�)
		
		int total = 0;
		
		for(int j=1; j<=10; j++) {
			
			
			if(j % 2 ==1) {
				continue; //��(Ȧ��)�̸� ���ǹ����� �̵�
			}
			
			total += j;
		}
		
			System.out.println("1���� 10���� ¦�� �� : "+total);
	}
}
