package class37_ThisKeywordStaticVariable;

public class StaticChickenTester {

	public static void main(String[] args) {
		
		StaticChicken sc = new StaticChicken();
		StaticChicken sc2 = new StaticChicken(2);
		StaticChicken sc3 = new StaticChicken(2, 5, "UZB");

		System.out.println(StaticChicken.numOfChicken);
	}

}
