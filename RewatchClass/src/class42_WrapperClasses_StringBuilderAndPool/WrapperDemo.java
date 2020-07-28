package class42_WrapperClasses_StringBuilderAndPool;

public class WrapperDemo {

	public static void main(String[] args) {

		Double d = new Double(20.5);
		System.out.println(d.intValue());
		System.out.println(d.compareTo(20.5));
		
		String str = "25360";
		int m = Integer.parseInt(str); // returns primitive type
		System.out.println(m);
		
		int o = 3258;
		String s = "" + o;
		String s1 = String.valueOf(o);
		System.out.println(s);
		System.out.println(s1);
		
		Integer in = Integer.valueOf("25"); // returns object type
		System.out.println(in);
		Double db = Double.valueOf("20.3"); // returns object type
		System.out.println(db);
		
		
//		Double db2 = (double)new Integer(5);
		
		
		Integer x = 3 + new Integer(4);
		System.out.println(x);
	}

}
