package p245;

public interface MyInterface1 {

	default void defaultMethod() {
		System.out.println("MYInterface1의 default 메서드");
	}
	
	static void staticMehod() {
		System.out.println("MYInterface1의 static 메서드");
	}
}
