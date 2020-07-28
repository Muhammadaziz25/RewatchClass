package class44_Inheritance;

public class CircleTester {

	public static void main(String[] args) {

		Circle c = new Circle();
		Circle c2 = new Circle(5.8);
		Circle c3 = new Circle(2.7, "grey", true);
		
		System.out.println(c.toString());
		System.out.println(c3.toString());
		
		System.out.println("The area is: " + c2.getArea());
		System.out.println("The perimeter is: " + c2.getPerimeter());
		c2.getDate();
		
	}

}
