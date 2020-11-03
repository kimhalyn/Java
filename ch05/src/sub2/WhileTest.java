package sub2;
/*
 * 날짜 : 2020/11/04
 * 이름 : 김하린
 * 내용 : 반복문 while 실습하기 교재 p92
 */
public class WhileTest {
	public static void main(String[] args) {
		
		//1~10까지 합
		
		int k = 1;  		//초기식
		int sum = 0;
		
		while(k <= 10) { 	//조건식
			sum += k;
			k++; 			//증감식
			
		}

		System.out.println("1부터 10까지 합 :"+sum);
		
		//do while : 최초 한번은 무조건 실행하는 반복문
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
		
		System.out.println("1부터 10까지 짝수합 : "+esum);
		
		//break : 반복문 종료
		
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 ==0 && num % 7 ==0) {
				break;
			}
			
		}
		
			System.out.println("5와 7의 최소공배수 : "+num);
		
		//continue : 반복문의 끝으로 이동(=상위로 이동한다)
		
		int total = 0;
		
		for(int j=1; j<=10; j++) {
			
			
			if(j % 2 ==1) {
				continue; //참(홀수)이면 조건문으로 이동
			}
			
			total += j;
		}
		
			System.out.println("1부터 10까지 짝수 합 : "+total);
	}
}
