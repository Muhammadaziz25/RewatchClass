package class41_Boxing;

public class Boxing {

	public static void main(String[] args) {

		char ch = 'a';
		byte b = 8;
		short sh = 16;
		int i = 50;
		long l = 25341l;
		float f = 52.36f;
		double d = 52.4;
		boolean is = true;
		
		Character ch1 = ch; //autoBoxing
		Character ch2 = new Character(ch);// Boxing - Wrapping
		System.out.println(ch1);
		
		Byte b1 = b;
		Byte b2 = new Byte(b);
		System.out.println(b2.doubleValue());
		
		Short sh1 = sh;
		Short sh2 = new Short(sh);
		
		Integer i1 = i;
		Integer i2 = new Integer(i);
		
		Long l1 = l;
		Long l2 = new Long(l);
		
		Float f1 = f;
		Float f2 =  new Float(f);
		
		Double d1 = d;
		Double d2 = new Double(d);
		
		Boolean is1 = is;
		Boolean is3 = new Boolean(is);
	}

}
