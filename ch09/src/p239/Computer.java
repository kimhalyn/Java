package p239;

import p238.Amd;
import p238.GraphicCard;
import p238.Nvidia;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 : "+gc.MEMORY);
		
		//Amd로 생성
		gc = new Amd();
		gc.process();
		
		
		//Nvidia로 교체
		gc = new Nvidia();
		gc.process();
		
	}
}
