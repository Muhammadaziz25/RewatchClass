package class37_ThisKeywordStaticVariable;

public class ChickenWithThis {

	int eggs;
	int age;
	String breed;

	public ChickenWithThis() {

	}

	public ChickenWithThis(int eggs, int age) {

		this.eggs = eggs;
		this.age = age;
	}

	public ChickenWithThis(int eggs, int age, String breed) {

		this(eggs, age);
		this.breed = breed;
	}

	public void layEggs() {
		System.out.println("Laying eggs");
	}

	public void cluck() {
		System.out.println("Clucking");
	}

	public void setNumEggs(int eggs) {
		this.eggs = eggs;
	}

}
