package p126;

import java.util.Arrays;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 배열 복사 p126
 */
public class ArrEx15 {
	public static void main(String[] args) {
		
		//원본 배열
		int[] arrInt = {1,2,3};
		
		//복사할 배열
		int[] arrInt2 = null;
		
		arrInt2 = Arrays.copyOf(arrInt, 5);
		
		//배열 값 출력
		for (int i =0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
