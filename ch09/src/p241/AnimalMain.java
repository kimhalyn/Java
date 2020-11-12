package p241;

import p240.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		//eat.eat(); //¿¡·¯
		
		Eagle eagleObj = (Eagle)eagle;
		eagleObj.eat();
		
	}
}
