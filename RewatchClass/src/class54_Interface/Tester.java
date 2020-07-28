package class54_Interface;

public class Tester {

	public static void main(String[] args) {

		Object[] objects = {new Tiger(), new Chicken(),
				new Apple(), new Orange()};
		
		for(Object object : objects) {
			
//			if(object instanceof Animal) {
//				((Animal) object).sound();
//			}
//			if(object instanceof Edible) {
//				((Edible) object).howToEat();
//			}
			
			if(object instanceof Huntable) {
				((Huntable) object).howToHunt();
			}
			
			if(object instanceof Commercializable) {
				((Commercializable) object).howToCommercial();
			}
		}
	}

}
