package class40_Encapsulation;

public class ImmutableObject {

	public static void main(String[] args) {

		String str = "Life";
		System.out.println(str);
		str.concat(" is beautiful");
		System.out.println(str);
		
		str = str.concat(" is beautiful");
		System.out.println(str);
//		String is immutable
	}

}
