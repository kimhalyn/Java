package p353;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import p352.Circle;
import p352.Rectangle;

public class ListEx3 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Circle(3.0));
		list.add(new Rectangle(3,4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6));
		
		System.out.println("전체 도형의 면적의 합 : "+getArea(list));
		System.out.println("전체 도형의 둘레의 합 : "+getLength(list));
		
	}
	
	private static double getLength(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			Shape s = (Shape)list.get(i);
			value += s.length();
		}
		return value;
	}
	
	private static double getArea(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			value += ((Shape)list.get(i)).area();
		}
		return value;
	}
}
