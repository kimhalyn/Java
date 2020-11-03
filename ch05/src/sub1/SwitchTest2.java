package sub1;

import java.util.Scanner;


public class SwitchTest2 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("점수입력 : ");
	int score = sc.nextInt();
	
	System.out.println("입력점수 : "+score);
		int rs = (score / 10);
		
		switch(rs) {
		
		case 9:
			System.out.println("A입니다");
			break;
		
		case 8:
			System.out.println("B입니다");
			break;
		
		case 7:
			System.out.println("C입니다");
			break;
		
		case 6:
			System.out.println("D입니다");
			break;
		
		default:
			System.out.println("F입니다");
			break;
		
		
		}
	
}
}
