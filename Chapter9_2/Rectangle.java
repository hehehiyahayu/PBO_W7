package Chapter9_2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double RWidth, double RLength) {
		super("Rectangle");
		width = RWidth;
		length = RLength;
	}
	
	public double area() {
		return width * length;
	}
	
	public String toString() {
		return super.toString() + " with width " + width + " and length " + length;
	}
}
