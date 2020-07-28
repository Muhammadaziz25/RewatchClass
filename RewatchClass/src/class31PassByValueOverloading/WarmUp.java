package class31PassByValueOverloading;

public class WarmUp {
	public static void main(String[] args) {
		displayIntReversed(3154);

		System.out.println(reverseInteger(6549));
		System.out.println(isPalindrome(2001));
	}

	/*
	 * 
	 */
	public static void displayIntReversed(int i) {
		int remainder;
		while (i > 0) {
			remainder = i % 10;
			System.out.print(remainder);
			i /= 10;
		}
		System.out.println();
	}

	public static int reverseInteger(int i) {
		String reversed = "";
		int remainder;
		while (i > 0) {
			remainder = i % 10;
			reversed = reversed + remainder;
			i /= 10;

		}
		return Integer.parseInt(reversed);
	}
	
	public static boolean isPalindrome(int num) {
		if(num==reverseInteger(num)) {
			return true;
		}else {
			return false;
		}
	}
}
