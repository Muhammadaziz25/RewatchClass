package class32_VarArgs;

public class WarmUp {

	public static void main(String[] args) {

		displaySort(5, 2, 8);
		
	}
	
	public static void displaySort( int a, int b, int c) {
		int temp;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c =temp;
		}
		if(a >b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("Sorted numbers are: " + a + " " + b + " " + c);
	}

}
