package p185;

import p184.ClassA;

public class ClassC {
	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		ca.print1();
		
		// ClassB cb = new ClassB(); 접근제한자 때문에 에러
	}

}
