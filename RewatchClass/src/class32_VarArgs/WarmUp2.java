package class32_VarArgs;

public class WarmUp2 {

	public static void main(String[] args) {

		System.out.println(genStr());
		System.out.println(genStr(25));
		System.out.println(genStr(true));
		System.out.println(genStr(25, true));
	}

	public static String genStr() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			str = str + (char) ('a' + Math.random() * 26);
		}
		System.out.println(str.length());
		return str;
	}

	public static String genStr(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = str + (char) ('a' + Math.random() * 26);
		}
		return str;
	}

	public static String genStr(boolean isUppercase) {
		String str = "";
		if (isUppercase) {
			for (int i = 0; i < 10; i++) {
				str = str + (char) ('A' + Math.random() * 26);
			}
		} else{
			for (int i = 0; i < 10; i++) {
				str = str + (char) ('a' + Math.random() * 26);
			}
		}
		return str;
	}
	
	public static String genStr(int length, boolean isNumeric) {
		String str = "";
		if(isNumeric) {
			for (int i = 0; i < length; i++) {
				str = str + (int) (0 + Math.random() * 9);
			}
		} else {
			genStr();
		}
			
		return str;
	}

}
