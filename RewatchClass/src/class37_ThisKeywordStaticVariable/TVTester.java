package class37_ThisKeywordStaticVariable;

public class TVTester {

	public static void main(String[] args) {

		TV tv = new TV();
		TV tv2 = new TV(true);
		TV tv3 = new TV(10, 11);
		TV tv4 = new TV(true, 8, 2);
		
		tv.turnOn();
		tv.setChannel(7);
		System.out.println(tv.channel);
		tv.channelUp();
		System.out.println(tv.channel);
	}

}
