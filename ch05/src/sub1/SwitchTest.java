package sub1;
/*
 * 날짜 : 2020/11/3
 * 이름 : 김하린
 * 내용 : 조건문 Switch 실습하기 교재 p86
 */

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		int num = 4;
		int result = num % 2;
		
		switch(result) {
		
		case 0:
			System.out.println("num은 짝수 입니다.");
			break;
		
		case 1:
			System.out.println("num은 홀수 입니다.");
			break;
		}
	}
}
	
		