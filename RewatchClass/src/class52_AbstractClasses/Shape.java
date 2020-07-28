package class52_AbstractClasses;

import java.util.Date;

public abstract class Shape {
	
	private String color = "white";
	private boolean filled = false;
	private Date date;
	
	protected Shape() {
		date = new Date();
	}
	
	protected Shape(String color, boolean filled) {
		this.color  =color;
		this.filled = filled;
		
		date = new Date();
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDate() {
		System.out.println(date);
		return date;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", date=" + date + "]";
	}
	
	public  abstract double getPerimeter();
	public abstract double getArea();

}
