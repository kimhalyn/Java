package p216;

public abstract class Shape {
	String type;
	Shape (String type) {
		this.type = type;
	}
	
	abstract double area();
	abstract double length();
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super ("??");
		this.r = r;
	}
	@Override
	double area() {
		return r * r* Math .PI;
	}
	@Override
	double length() {
		return 2 * r * Math .PI;
	}
	@Override
	public String toString() {
		return "shape [type=" + type + ", r=" + r + "]";
	}
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("?簢??");
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "shape [type="+type+", width="+width+", height="+height+"]";
	}
}


