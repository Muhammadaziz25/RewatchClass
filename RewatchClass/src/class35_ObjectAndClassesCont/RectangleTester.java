package class35_ObjectAndClassesCont;

public class RectangleTester {

	public static void main(String[] args) {

		
		
		Rectangle rc = new Rectangle();
		
		rc.width = 5.3;
		rc.height = 2.8;
		rc.color = "white";
		
		System.out.println("The area of rectangle is " + rc.getArea() + " and the perimeter is " + rc.getPerimeter());
		System.out.println("Is rc square? " + rc.isSquare()); 
		
		rc.setHeight(4.9);
		rc.setWidth(4.9);
		
		
		System.out.println("The area of rectangle is " + rc.getArea() + " and the perimeter is " + rc.getPerimeter());
		System.out.println("Is rc square? " + rc.isSquare()); 
	}

}
