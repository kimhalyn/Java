package sub1;
/*
 * ��¥ : 2020/11/3
 * �̸� : ���ϸ�
 * ���� : ���ǹ� Switch �ǽ��ϱ� ���� p86
 */

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		int num = 4;
		int result = num % 2;
		
		switch(result) {
		
		case 0:
			System.out.println("num�� ¦�� �Դϴ�.");
			break;
		
		case 1:
			System.out.println("num�� Ȧ�� �Դϴ�.");
			break;
		}
	}
}
	
		