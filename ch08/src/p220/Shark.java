package p220;

import p219.Animal;

public class Shark extends Animal {
	
	public Shark(String type, String name) {
		super(type, name);
	}
	public void sleep() {
		System.out.println(this.name+"��(��) ���ӿ��� ���� �ܴ�.");
	}
}
