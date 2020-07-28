package class36_Constructor;
/**
 * 19.03.2020
 * @author Eagle
 *
 */

public class ChickenTester {

	public static void main(String[] args) {

		Chicken ch = new Chicken(5, 2, "golden");
		
		System.out.println(ch.breed);
		
		Chicken ch2 = new Chicken(0, 1, "uzbek");
		System.out.println(ch2.breed);
		
		Chicken ch3 = new Chicken();
	}

}
