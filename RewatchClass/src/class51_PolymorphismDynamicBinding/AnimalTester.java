package class51_PolymorphismDynamicBinding;

public class AnimalTester {

	public static void main(String[] args) {

		Animal a = new Bird();
		Animal a2 = new Frog();
		Animal a3 = new Snake();
		
//		a.wakeUp();
//		a2.wakeUp();
//		a3.wakeUp();
//		
//		a.eat();
//		a2.eat();
//		a3.eat();
		
		Animal[] animal = {new Animal(),new Bird(), new Frog(), new Snake()};
		
		for (Animal an : animal) {
			an.eat();
		}
	}

}
