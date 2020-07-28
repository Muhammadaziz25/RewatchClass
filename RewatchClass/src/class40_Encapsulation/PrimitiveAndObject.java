package class40_Encapsulation;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		
		int i, t;
		i=1;
		t=8;
		System.out.println(i);
		i=t;
		System.out.println(i);
		
		System.out.println("=============================");
		

		String one, two;
		one = new String("a");
		two = new String("b");
		System.out.println(one);
		System.out.println(two);
		one = two;
		System.out.println(one);
		String three = one;
		System.out.println(three);
		one = null;
		System.out.println(one);
	}

}
