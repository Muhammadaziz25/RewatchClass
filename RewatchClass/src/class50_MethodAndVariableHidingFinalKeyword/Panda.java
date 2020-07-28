package class50_MethodAndVariableHidingFinalKeyword;
/**
 * 11.05.2020
 * @author Eagle
 * Static Method Hiding
 *
 */
public class Panda extends Bear {

	public static void eat() {
		System.out.println("Panda is chewing");
	}
	
//	public static void sleep() {  // This static method cannot hide the instance method from Bear
//		System.out.println("Bear is sleeping");
//	}
	
	public static void main(String[] args) {
	 Panda panda = new Panda();
	 panda.eat();
	}
}
