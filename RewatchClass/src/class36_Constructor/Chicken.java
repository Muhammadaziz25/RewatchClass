package class36_Constructor;
/**
 * 19.03.2020
 * @author Eagle
 *
 */

public class Chicken {
	
	int eggs;
	int age;
	String breed;
	
	public Chicken( int eggs1, int age1, String breed1) {

		eggs = eggs1;
		age = age1;
		breed = breed1;
	}
	
	public Chicken() {
		
	}
	
	public void layEggs() {
		System.out.println("Laying eggs");
	}
	
	public void cluck() {
		System.out.println("Clucking");
	}

	

}
