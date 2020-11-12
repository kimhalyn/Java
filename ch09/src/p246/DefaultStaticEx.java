package p246;

import p245.MyInterface1;
import p245.MyInterface2;

public class DefaultStaticEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.defaultMethod();
		c.method2();
		
		MyInterface1.staticMehod();
		MyInterface2.staticMethod();
	}
}
