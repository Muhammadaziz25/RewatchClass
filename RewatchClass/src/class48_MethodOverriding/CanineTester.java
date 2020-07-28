package class48_MethodOverriding;
/**
 * 9.05.2020
 * @author Eagle
 *
 */
public class CanineTester {

	public static void main(String[] args) {

		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		System.out.println(new GreyWolf().getAverageWeight());
	}

}
