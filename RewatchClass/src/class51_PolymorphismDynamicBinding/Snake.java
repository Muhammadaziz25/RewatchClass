package class51_PolymorphismDynamicBinding;

public class Snake extends Animal {

	public void eat() {
		eatFrogs();
		eatMouse();
	} 
	
	private void eatFrogs() {
		System.out.println("Birds eat frogs");
	}
	
	private void eatMouse() {
		System.out.println("Birds eat mouse");
	}
}
