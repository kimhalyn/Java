package p245;

public interface MyInterface2 {

	default void defaultMethod() {
		System.out.println("MyInterface2의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2의 default 메서드 ");
	}
}
