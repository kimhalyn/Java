package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/11/03
 * 이름 : 김하린
 * 내용 : If 조건문 실습하기 교재 p79
 */
public class IfTest {
	public static void main(String[] args) {
		
		
		//if
		int num1 =1;
		int num2 =2;
		
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다");
			
		}
		
		if (num1 > 1) {
			System.out.println("num1은 1보다 크다"); //거짓이라서 출력안됨.(건너뜀)
			
		}
		
		if (num1 > 0) {//조건식1이 false면 그냥 도출, true면 조건식2로 이동.
			
			if (num2 > 1) { //조건식2
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
			
		}
		
		if (num1 >0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다"); //윗 문장과 동일한 뜻임.
			
		}
		
		
		//if ~ else
		
		int var1 =1; //선언과 동시에 1로 초기화 (=변수 생성)
		int var2 =2;
		
		if (var1 > var2) {
			System.out.println("var1은 var2보다 크다.");
			
		} else {
			System.out.println("var1은 var2보다 작다."); //문장이 거짓이므로 else문장이 출력된다.
		}
		
		
		//if ~ else if ~ else
		
		int n1=1, n2=2, n3=3, n4=4;
		if (n1 > n2) {//조건1
			System.out.println("n1은 n2보다 크다");
		} else if (n2 > n3){//조건2
			System.out.println("n2는 n3보다 크다");
		} else if (n3 > n4){//조건3
			System.out.println("n3은 n4보다 크다");
		} else {//만약 조건들이 전부 true라면 실행의 우선순위에 따라 조건1만 출력된다.
			System.out.println("n4가 가장 크다");
		}
		
		
		//연습문제
		Scanner sc = new Scanner(System.in); //scan에서, sys, in 하고 스페이스 엔터
				
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
			
		System.out.println("입력 점수 : "+score);
		
		if(score >= 90 && score <= 100) {
			System.out.println("A입니다.");
		}else if(score >=80 && score <90) {
			System.out.println("B입니다.");
		}else if(score >=70 && score <80) {
			System.out.println("C입니다.");
		}else if(score >=60 && score <70) { 
			System.out.println("D입니다.");
		}else {
			System.out.println("F입니다.");
		}
			
	}

}
