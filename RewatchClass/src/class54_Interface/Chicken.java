package class54_Interface;

public  class Chicken extends Animal implements Edible{
	
	public void howToEat() {
		System.out.println("Chicken: Grill it");
	}
	
	public void sound() {
		System.out.println("Chicken: Kukuku");
	}

	
	
	public void howToCommercial() {
		System.out.println("Chicken: Selling eggs and meat");
	}

}
