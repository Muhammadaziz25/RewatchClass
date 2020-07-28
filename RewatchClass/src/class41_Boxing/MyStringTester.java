package class41_Boxing;
/**
 * 31.03.2020
 * @author Eagle
 *
 */

public class MyStringTester {
	/*
	 * Constructor should accept one argument of type String
	 * have a few methods which are similar to String methods
	 * like: length(), substring(index), substring(index1, index2)
	 * concat()
	 */
	public static void main(String[] args) {
		MyString my = new MyString("Good");
		int stringLength = my.length();
		System.out.println(stringLength);
		System.out.println(my.substring(1));
		System.out.println(my.substring(1,5));
	}

}

class MyString {
	
	private String value;
	
	
	public MyString(String value) {
		this.value = value;
	}
	
	public int length() {
		return value.toCharArray().length;
	}
	
	public String substring( int index) {
		String substring = "";
		for (int i = 0; i < value.length(); i++) {
			if(i>=index) {
				substring += value.toCharArray()[i];
			}
		}
		return substring;
	}
	
	public String substring( int index1, int index2) {
		String substring = "";
		for (int i = 0; i < value.length(); i++) {
			if(i>=index1 && i<index2) {
				substring += value.toCharArray()[i];
			}
		}
		return substring;
	}
	
}



