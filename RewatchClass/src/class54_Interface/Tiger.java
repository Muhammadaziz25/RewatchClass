package class54_Interface;

public class Tiger extends Animal implements Huntable {
	public void sound() {
		System.out.println("Tiger: Roar!!!");
	}
	
	public  void howToHunt() {
		System.out.println("Tiger: Hunting in Africa");
	}
	
	public void howToCommercial() {
		System.out.println("Tiger: Put in Zoo");
	}
}
