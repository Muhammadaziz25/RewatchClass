package class40_Encapsulation;

public class ImmutableObject {

	public static void main(String[] args) {

		String str= "Life";
		str.concat(" is beatiful");
		System.out.println(str);
		
		str = str.concat(" is beatiful");
		System.out.println(str);
//		String is immutable
//		StringBuffer is mutable
	}

}
