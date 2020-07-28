package class42_WrapperClasses_StringBuilderAndPool;

public class Quiz {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		sb.delete(1, 1);
		System.out.println(sb);
//		do {
//			sb.delete(0, 5);
//		}while(sb.length()>5);
//			System.out.println(sb);
		
	}

}
