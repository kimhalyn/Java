package p128;
/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 향상된 for문 p128
 */
public class ArrEX17 {
	public static void main(String[] args) {
		
		//배열선언
		String[] names = {"홍길동", "이순신", "김유신"};
		int[] scores = {90, 80, 100};
		
		int i=0;//인덱스 변수
		for(String name : names) {
			System.out.println(name + " : " + scores[i]);
			i++;
		}
	}
}
