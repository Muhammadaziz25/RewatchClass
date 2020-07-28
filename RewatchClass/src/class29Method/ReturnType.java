package class29Method;

public class ReturnType {

	public static void main(String[] args) {
		
		int returnValue = max(10, 17);
		System.out.println(returnValue);

	}
	
	public static int max(int num1, int num2) {
		int max = num1;
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
		
		
	}

}
