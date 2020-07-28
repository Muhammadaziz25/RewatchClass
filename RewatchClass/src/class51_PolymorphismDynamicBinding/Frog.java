package class51_PolymorphismDynamicBinding;

public class Frog extends Animal {

	public void eat() {
		eatFlies();
		eatGrass();
	} 
	
	private void eatFlies() {
		System.out.println("Birds eat flies");
	}
	
	private void eatGrass() {
		System.out.println("Birds eat grass");
	}
}
