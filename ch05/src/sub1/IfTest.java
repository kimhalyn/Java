package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2020/11/03
 * �̸� : ���ϸ�
 * ���� : If ���ǹ� �ǽ��ϱ� ���� p79
 */
public class IfTest {
	public static void main(String[] args) {
		
		
		//if
		int num1 =1;
		int num2 =2;
		
		if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�");
			
		}
		
		if (num1 > 1) {
			System.out.println("num1�� 1���� ũ��"); //�����̶� ��¾ȵ�.(�ǳʶ�)
			
		}
		
		if (num1 > 0) {//���ǽ�1�� false�� �׳� ����, true�� ���ǽ�2�� �̵�.
			
			if (num2 > 1) { //���ǽ�2
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");
			}
			
		}
		
		if (num1 >0 && num2 > 1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��"); //�� ����� ������ ����.
			
		}
		
		
		//if ~ else
		
		int var1 =1; //����� ���ÿ� 1�� �ʱ�ȭ (=���� ����)
		int var2 =2;
		
		if (var1 > var2) {
			System.out.println("var1�� var2���� ũ��.");
			
		} else {
			System.out.println("var1�� var2���� �۴�."); //������ �����̹Ƿ� else������ ��µȴ�.
		}
		
		
		//if ~ else if ~ else
		
		int n1=1, n2=2, n3=3, n4=4;
		if (n1 > n2) {//����1
			System.out.println("n1�� n2���� ũ��");
		} else if (n2 > n3){//����2
			System.out.println("n2�� n3���� ũ��");
		} else if (n3 > n4){//����3
			System.out.println("n3�� n4���� ũ��");
		} else {//���� ���ǵ��� ���� true��� ������ �켱������ ���� ����1�� ��µȴ�.
			System.out.println("n4�� ���� ũ��");
		}
		
		
		//��������
		Scanner sc = new Scanner(System.in); //scan����, sys, in �ϰ� �����̽� ����
				
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
			
		System.out.println("�Է� ���� : "+score);
		
		if(score >= 90 && score <= 100) {
			System.out.println("A�Դϴ�.");
		}else if(score >=80 && score <90) {
			System.out.println("B�Դϴ�.");
		}else if(score >=70 && score <80) {
			System.out.println("C�Դϴ�.");
		}else if(score >=60 && score <70) { 
			System.out.println("D�Դϴ�.");
		}else {
			System.out.println("F�Դϴ�.");
		}
			
	}

}
