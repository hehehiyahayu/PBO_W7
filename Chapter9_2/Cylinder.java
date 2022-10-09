package Chapter9_2;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double CRadius, double CHeight) {
		super("Cylinder");
		radius = CRadius;
		height = CHeight;
	}
	
	public double area() {
		return Math.PI * radius * radius * height;
	}
	
	public String toString() {
		return super.toString() + " with radius " + radius + " and height " + height;
	}
}
