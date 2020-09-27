package class41_Boxing;
/**
 * 31.03.2020
 * @author Eagle
 *
 */
public class StringBuilderDemo {
	 
	public static void main(String[] args) {
		String str = "some text";
		StringBuilder builder = new StringBuilder("some text");
		System.out.println(builder);
		
		str.concat(" life");
		System.out.println(str);
		builder.append(" life");
		System.out.println(builder);
		builder.delete(1, 5);
		System.out.println(builder);
		builder.deleteCharAt(2);
		System.out.println(builder);
		builder.insert(1, "o");
		System.out.println(builder);
		builder.replace(1, 5, "me");
		System.out.println(builder);
//		builder.substring(2);  substring doesn't modify StringBuilder object
//		System.out.println(builder);
		
		builder.insert(0, new char[] {'h','i','r','e'}, 0, 4);
		System.out.println(builder);
		
//		sme life included
//		index 0 is >>> s
//		starting point of array is >>> 'h'
//		2 number of elements >>> 'h','i','r', 'e'
//		result == hiresme life included
//		builder.insert(0, new char[] {'h','i','r','e'}, 0, 4);
//		System.out.println(builder);
	}

}
