package p220;

import p219.Animal;

public class Lion extends Animal {
	
	public Lion(String type, String name) {
		super(type, name);
	}
	public void sleep() {
		System.out.println(this.name +"��(��) ���ӿ��� ���� �ܴ�.");
	}
}
