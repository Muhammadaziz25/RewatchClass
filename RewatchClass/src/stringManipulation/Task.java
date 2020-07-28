package stringManipulation;

public class Task {

	public static void main(String[] args) {

		
		String text = "I live in United States Of America";
		
		//System.out.println(text.substring(0, 10) + "U.S.A");
		//String text1 = text.substring(0, text.indexOf('U') + 1);
		System.out.println(text.length());
		String text1 = "" + text.charAt(text.indexOf('U'));
		text1 = text1 + "." + text.charAt(text.indexOf('S')) + "." + text.charAt(text.indexOf('A')) + ".";
		//text1 = text1 + "." + text.charAt(text.indexOf('A'));
		System.out.println("\"" + text1 + "\"");
		
		String str = "Life is beautiful";
		System.out.println(str.indexOf('i'));
		int indexOfF = str.indexOf('i')+1;
		System.out.println(indexOfF);
		System.out.println(str.indexOf('i', indexOfF)); //finding index of second i
		int indexOfSecondI = str.indexOf('i', indexOfF);
		System.out.println(str.indexOf('i',indexOfSecondI+1)); //finding index of third i
	}

}
