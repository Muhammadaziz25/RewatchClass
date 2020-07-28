package class52_AbstractClasses;

public class Subclass extends Superclass {

	
	@Override
	public void method1() {
		System.out.println("Subclass implemetation");
	}

	@Override
	public void method2() {
		System.out.println("Subclass implemetation");
		
	}
	
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.method1();
		s.method2();
	}

}
