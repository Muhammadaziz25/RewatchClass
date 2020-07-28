package class51_PolymorphismDynamicBinding;

public class Bird extends Animal{
	
	public void eat() {
		eatWorms();
		eatSeeds();
		eatInsects();
	}
	
	private void eatWorms() {
		System.out.println("Birds eat worms");
	}
	
	private void eatSeeds() {
		System.out.println("Birds eat seeds");
	}
	
	private void eatInsects() {
		System.out.println("Birds eat insects");
	}
	

}
