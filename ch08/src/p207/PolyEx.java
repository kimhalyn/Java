package p207;

import p206.Parent;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child ();
		c.run();
		
		//부모클래스의 자료형으로 선언(자동형변환)
		Parent p = new Child();
		p.run();
		//p.eat(); 에러
		
	}
}
