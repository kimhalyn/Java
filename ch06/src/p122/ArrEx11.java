package p122;
/*
 * 날짜 : 2020/11/05
 * 이름 : 김하린
 * 내용 : 다차원 배열 p122
 */
public class ArrEx11 {
	public static void main(String[] args) {
		
		int[][][] arrInt = new int [3][3][3];
		
		int value = 0;
		//값 대입
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}
		// 값 출력
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				for(int k=0; k<=2; k++) {
					System.out.println(arrInt[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
	}
}

