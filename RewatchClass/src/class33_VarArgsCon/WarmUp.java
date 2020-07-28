package class33_VarArgsCon;

public class WarmUp {

	public static void main(String[] args) {
		
		System.out.println(maxNumber(50, 10, 70, 8));

	}
	
	public static int maxNumber(int a, int b) {
		
		return a > b ? a : b;
	}
	
	public static int maxNumber(int a, int b, int c) {
		return maxNumber(maxNumber(a, b),c);
	}
	
	public static int maxNumber(int a, int b, int c, int d) {
		
		return maxNumber(maxNumber(maxNumber(a, b),c),d);
	}

}
