package class38_ArrayList_Constructor_Encapsulation;
/**
 * 20.03.2020
 * @author Eagle
 *
 */
public class DateTester {

	public static void main(String[] args) {

		Date date = new Date();
		Date date2 = new Date(22, 02, 2002);
		
		date.setDay(20);
		date.setMonth(3);
		date.setYear(2020);
		
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
//		
//		System.out.println();
//		
//		System.out.println(date2.day);
//		System.out.println(date2.month);
//		System.out.println(date2.year);
	}

}
