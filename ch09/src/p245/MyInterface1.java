package p245;

public interface MyInterface1 {

	default void defaultMethod() {
		System.out.println("MYInterface1�� default �޼���");
	}
	
	static void staticMehod() {
		System.out.println("MYInterface1�� static �޼���");
	}
}
