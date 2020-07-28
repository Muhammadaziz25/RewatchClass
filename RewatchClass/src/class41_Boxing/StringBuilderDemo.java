package class41_Boxing;
/**
 * 31.03.2020
 * @author Eagle
 *
 */
public class StringBuilderDemo {
	 
	public static void main(String[] args) {
		String text = "some text";
		
		StringBuilder sb = new StringBuilder("some text");
		System.out.println(sb);
		sb.append(" included");
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);
		sb.deleteCharAt(7);
		System.out.println(sb);
		sb.insert(2, "hello");
		System.out.println(sb);
		sb.replace(11, 12, " i");
		System.out.println(sb);
		
//		sohellotext included
//		index 2 is >>> h
//		starting point of array is >>> 'w'
//		2 number of elements >>> 'w', 'e'
//		result == sowehellotext included
		sb.insert(2, new char[] {'w', 'e'}, 0, 2);
		System.out.println(sb);
	}

}
