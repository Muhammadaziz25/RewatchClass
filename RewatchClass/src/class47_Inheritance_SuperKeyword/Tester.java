package class47_Inheritance_SuperKeyword;

public class Tester {

	public static void main(String[] args) {

		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2.5, 1.4);
		Rectangle r3 = new Rectangle(3.4, 2.6, "grey", true);
		
//		System.out.println(r1.toString());
//		System.out.println(r2.toString());
		System.out.println(r3.getArea());
		System.out.println(r3.getPerimeter());
		System.out.println(r3.getColor());
	}

}
