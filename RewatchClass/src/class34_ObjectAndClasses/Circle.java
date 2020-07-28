package class34_ObjectAndClasses;

public class Circle {
	
	double radius;
	String color;
	
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
	
	public double getParameter() {
		return 2*radius*Math.PI;
	}
	
	public void setRadius(double num) {
		radius = num;
	}

}
