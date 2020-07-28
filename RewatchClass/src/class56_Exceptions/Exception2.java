package class56_Exceptions;

public class Exception2 {

	public static void main(String[] args) {

		try {
			System.out.println(division(25, 3));
		}catch(ArithmeticException e) {
			System.out.println("Dividing by zero is impossible, program ending");
		}
		
		System.out.println("After divison");
		
	}
	
	public static double division(double a, double b) {
		if(b==0) {
			throw new ArithmeticException();
//			System.out.println("Dividing by zero is impossible, program ending");
//			System.exit(0);
		}
		return a/b;
	}

}
