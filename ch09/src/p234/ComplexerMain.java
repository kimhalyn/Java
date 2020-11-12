package p234;

import p233.Complexer;

public class ComplexerMain {

	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8465-4321");
		com.receive("02-8765-4321");
	}
}
