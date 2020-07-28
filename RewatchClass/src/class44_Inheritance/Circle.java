package class44_Inheritance;

public class Circle extends Shape{

	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;

	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	public void printcircleInfo() {
		System.out.println("The circle is made: " + getDate() + ", the radius is " + radius);
	}
	
}
