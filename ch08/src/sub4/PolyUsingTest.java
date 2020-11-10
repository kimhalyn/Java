package sub4;
/*
 * 날짜 : 2020/11/11
 * 이름 : 김하린
 * 내용 : 다형성 활용 실습하기
 */

public class PolyUsingTest {
	public static void main(String[] args) {
		
		Tiger TIger = new Tiger();
		Eagle Ealge = new Eagle();
		Shark Shark = new Shark();
		
		
		Animal animal[] = {TIger, Ealge, Shark};
		
		
		animal [0].move();
		animal [0].hunt();
		
		animal [1].move();
		animal [1].hunt();
		
		animal [2].move();
		animal [2].hunt();
		
	}
}
