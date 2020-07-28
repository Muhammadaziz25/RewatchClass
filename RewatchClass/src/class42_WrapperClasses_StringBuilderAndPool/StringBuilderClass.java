package class42_WrapperClasses_StringBuilderAndPool;

public class StringBuilderClass {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		reverse("Good morning");
	}
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		return sb.toString();
	}

}
