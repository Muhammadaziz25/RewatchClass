package class48_MethodOverriding;
/**
 * 9.05.2020
 * @author Eagle
 *
 */
public class Wolf extends Canine{
	
	public double getAverageWeight() {
		return super.getAverageWeight()+30;
	}

}
