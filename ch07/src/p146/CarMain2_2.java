package p146;

public class CarMain2_2 {
	public static void main(String[] args) {
	
		Car[] cars = new Car[3];
		
		for(int i=0; i<cars.length; i++) {
			cars[i] = new Car();
			cars[i].color = "ȭ��Ʈ";
			cars[i].company = "���";
			cars[i].type = "����";
		}
		System.out.println("0�� �ε��� color : "+cars[0].color);
		System.out.println("1�� �ε��� color : "+cars[1].color);
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��";
		System.out.println("0�� �ε��� color : "+cars[0].color);
		System.out.println("1�� �ε��� color : "+cars[1].color);
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
}
}
