package p114;
/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 배열사용 p114
 */
public class Lotto {
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		int idx = 0;
		while (true) {
			int number = (int)(Math.random()*45)+1;
			
			boolean insert = true;
			for(int i=0; i<=idx; i++) {
				if(lotto[i] == number) {
					insert = false ;
					break;
				}
			}
				if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
				
			if(idx == 6) break;
		}
			for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
