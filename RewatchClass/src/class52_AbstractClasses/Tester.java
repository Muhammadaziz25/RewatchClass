package class52_AbstractClasses;

public class Tester {

	public static void main(String[] args) {

//		Shape s = new Shape(); // Cannot instantiate the type Shape
		Shape s1 = new Circle(0, "green", true);
		
		Shape s2 = new Rectangle(0, 1.7, "grey", true);
		
		System.out.println(equalArea(s1, s2));
	}
	
	public static boolean equalArea(Shape shape1, Shape shape2) {
		return shape1.getArea() == shape2.getArea();
	}

}
