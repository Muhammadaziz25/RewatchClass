package stringManipulation;
/**
 * 
 * @author Eagle
 *
 */

public class Immutable {
	public static void main(String[] args) {
		
		/*String immutable = "String is immutable";
		String prove = ", I have to prove that \"String is immutable\"";
		System.out.println(immutable.concat(prove));*/
		
		/*int num1 = 10;
		int num2 = 7;
		boolean isGreaterOrEqual = num1==num2 || num1<num2;
		System.out.println(isGreaterOrEqual);*/
		
		/*String s = "   Java  is  easy  ";
		s = s.toUpperCase();
		s = s.trim();
		s = s.substring(0,3);
		s = s + 'a';
		System.out.println(s.toLowerCase());
		
		System.out.println(50 + (int)(Math.random()*200));*/
		
		String immutable = "Hello";
        immutable.concat(" World");
        System.out.println(immutable);

		
	}

}
