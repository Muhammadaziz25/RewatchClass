package class29Method;

public class SumOfInt {

	public static void main(String[] args) {

		sum(1, 10);
		sum(100, 173);
	}
	
	public static void sum(int start, int end) {
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("The sum from " + start + " to " + end + " is " + sum);
		
	}

}
