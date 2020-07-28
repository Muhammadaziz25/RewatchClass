package class34_ObjectAndClasses;

public class Tester {

	public static void main(String[] args) {

		Circle circle = new Circle();
		
		circle.radius = 5.2;
		circle.color = "White";
		
//		double area = circle.getArea();
//		double perimeter = circle.getParameter();
		
		System.out.println("The area of circle is " + circle.getArea() + " and the perimeter is " + circle.getParameter());
		
		circle.setRadius(50);
		System.out.println("The area of circle is " + circle.getArea() + " and the perimeter is " + circle.getParameter());
	}

}
