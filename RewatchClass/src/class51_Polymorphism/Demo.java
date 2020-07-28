package class51_Polymorphism;

public class Demo {

	public static void main(String[] args) {
		displayDetails(new Circle(2.5, "grey", true));
		displayDetails(new Rectangle(1.7, 0.5));
	}
	
	public static void displayDetails(Shape s) {
		System.out.println(s.toString());
	}
}
