package class48_MethodOverriding;
/**
 * 9.05.2020
 * @author Eagle
 *
 */
public class GreyWolf extends Wolf {
	public double getAverageWeight() {
		return new Canine().getAverageWeight()+15;
	}
	
}
