package p145;

public class CarMain2 {
	public static void main(String[] args) {
		
		Car[] cars = new Car[3];
		
		Car tico = new Car();
		
		tico.color= "ȭ��Ʈ";
		tico.company= "���";
		tico.type= "����";
		
		for(int i=0; i<cars.length; i++) {
			cars[i] = tico;
		}
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��";
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
	}

}
