package p239;

import p238.Amd;
import p238.GraphicCard;
import p238.Nvidia;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("�޸� : "+gc.MEMORY);
		
		//Amd�� ����
		gc = new Amd();
		gc.process();
		
		
		//Nvidia�� ��ü
		gc = new Nvidia();
		gc.process();
		
	}
}
