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
		
		builder.insert(2, new char[] {'h','i'}, 0, 2);
		System.out.println(builder);
		
//		sohellotext included
//		index 2 is >>> h
//		starting point of array is >>> 'w'
//		2 number of elements >>> 'w', 'e'
//		result == sowehellotext included
//		sb.insert(2, new char[] {'w', 'e'}, 0, 2);
//		System.out.println(sb);
	}

}
