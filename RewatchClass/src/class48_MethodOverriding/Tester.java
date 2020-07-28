package class48_MethodOverriding;

public class Tester {

	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.multiply(5,7);
		
		Superclass spr = new Superclass();
		spr.multiply(10, 17);
	}
}
