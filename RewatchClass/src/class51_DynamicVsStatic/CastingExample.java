package class51_DynamicVsStatic;

public class CastingExample {
	public static void main(String[] args) {
		Object o = new Laptop(); //implicit casting >>> up casting
		
		Laptop l = (Laptop)o; // explicit casting >>> down casting
		
		Car c = new Car();
		
//		Laptop l2 = (Laptop)c; //Cannot cast from Car to Laptop
		
		Technology t = new Technology();
//		Technology t2 = new Laptop();
		Laptop l3 = (Laptop)t;
//		CastingExample ce = new Object();
	}
	
	
	
	

	}
