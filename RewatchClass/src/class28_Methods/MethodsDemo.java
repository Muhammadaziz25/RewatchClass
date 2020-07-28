package class28_Methods;

/**
 * 10.03.2020
 * @author Eagle
 *
 */
public class MethodsDemo {
	
	public static void main (String args[]) {
		String day = "morning";
		greeting(day);
		
		multiplication(5, 8);
		multipleParam("Abdurahman", 5, 5, 25);

	}
	/**
	 * @author Eagle
	 * Method Signature == Combination of method name and method parameter
	 */
	public static void greeting( String day) {
		System.out.println("Good " + day + " :-)");
	}
	
	public static void multiplication( int a, int b) {
		int result = a*b;
		System.out.println(result);
	}
	
	public static void multipleParam( String name, int a, int b, int result) {
		if(a*b == result) {
			System.out.println(name + ", " + a + " * " + b  + " = " +   result + " : Correct");
		} else {
			System.out.println(name + ", " + a + " * " + b  + " = " +   result + " : Incorrect");
		}
		
	}

}
