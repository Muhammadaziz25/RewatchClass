package class48_MethodOverriding;
/**
 * 9.05.2020
 * @author Eagle
 *
 */
public class Tree {

	private int age;
	private double height;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Tree() {
		
	}

	public Tree(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
	public int getAverageLifespan() {
		return 40;
	}

	@Override
	public String toString() {
		return "Tree [age=" + age + ", height=" + height + ", getAverageLifespan()=" + getAverageLifespan() + "]";
	}
	
	
	
	
}
