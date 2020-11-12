package p246;

import p245.MyInterface1;
import p245.MyInterface2;

public class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}

}
