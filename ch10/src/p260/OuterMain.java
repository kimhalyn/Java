package p260;

import p259.Outer;

public class OuterMain {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		out.setInterfaceEx(new InterfaceExlmple());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExlmple2());
		out.outerMethod();
	}
}
