package class48_MethodOverriding;
/**
 * 9.05.2020
 * @author Eagle
 *
 */
public class AppleTree extends Tree{

	private double yield;
	
	public AppleTree() {
		
	}

	public AppleTree(int age, double height, double yiled) {
		super(age, height);
		this.yield = yiled;
	}
	
	public int getAverageLifespan() {
		return super.getAverageLifespan()-11;
	}

	@Override
	public String toString() {
		return "AppleTree yield=" + yield + super.toString();
	}
	
	
	
	
}
