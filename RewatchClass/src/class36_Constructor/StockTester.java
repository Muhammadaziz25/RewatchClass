package class36_Constructor;
/**
 * 19.03.2020
 * @author Eagle
 *
 */

public class StockTester {

	public static void main(String[] args) {

		Stock st = new Stock();
		
		Stock st2 = new Stock("Dell", "DELL", 85.000, 92.000);
		System.out.println(st2.getPercentageOfPrice());
		
		Stock st3 = new Stock("Mercedez-Benz", "MB", 500.000, 758.000);
		System.out.println(st3.getPercentageOfPrice());
	}

}
