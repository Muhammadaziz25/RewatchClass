package class37_ThisKeywordStaticVariable;
/**
 * 19.03.2020
 * @author Eagle
 *
 */
public class StaticChicken {

	static int numOfChicken = 0;
	int eggs;
	int age;
	String breed;
	
	public StaticChicken() {
		numOfChicken++; 
	}
	
	public StaticChicken( int eggs1, int age1, String breed1) {

		eggs = eggs1;
		age = age1;
		breed = breed1;
		numOfChicken++;
	}
	
	public StaticChicken( int eggs1) {
		eggs = eggs1;
		numOfChicken++;
	}
	
	public static int getNumOfChicken() {
		return numOfChicken;
	}
	
	public void layEggs() {
		System.out.println("Laying eggs");
	}
	
	public void cluck() {
		System.out.println("Clucking");
	}
}
