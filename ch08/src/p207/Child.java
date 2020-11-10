package p207;

import p206.Parent;

public class Child extends Parent {
	
	public String name;
	
	//재정의 메서드
	
	public void run() {
		System.out.println("자식이 달린다.");
	}
	
	//추가된 메서드
	public void eat() {
		System.out.println("자식이 먹는다.");
	}
}
