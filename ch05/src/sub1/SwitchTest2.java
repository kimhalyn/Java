package sub1;

import java.util.Scanner;


public class SwitchTest2 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�����Է� : ");
	int score = sc.nextInt();
	
	System.out.println("�Է����� : "+score);
		int rs = (score / 10);
		
		switch(rs) {
		
		case 9:
			System.out.println("A�Դϴ�");
			break;
		
		case 8:
			System.out.println("B�Դϴ�");
			break;
		
		case 7:
			System.out.println("C�Դϴ�");
			break;
		
		case 6:
			System.out.println("D�Դϴ�");
			break;
		
		default:
			System.out.println("F�Դϴ�");
			break;
		
		
		}
	
}
}
