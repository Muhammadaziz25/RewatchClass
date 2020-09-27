package class39_EncapsulationAndStatic;
/**
 * 27.03.2020
 * @author Eagle
 *
 */
public class Book {

	long ISBN;
	static String type	= "Paper-based";
	
	
	public long getISBN() {
		return ISBN;
	}
	
	public static String getType() {
		return type;
	}
}
