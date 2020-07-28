package class35_ObjectAndClassesCont;

public class Rectangle {
	
	double width;
	double height;
	String color;
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	public boolean isSquare() {
		return width==height? true : false;
		
	}
	
	public void setWidth(double num) {
		width = num;
	}
	
	public void setHeight( double num) {
		height = num;
	}

}
