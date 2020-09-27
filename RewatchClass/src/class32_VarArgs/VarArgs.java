package class32_VarArgs;
/**
 * 15.03.2020
 */
import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		int[] intArr = {1,4,7,2,5};
		displayArray(1,4,7,2,5,8,3,6);
		
		

	}
	
	public static void displayArray(int ... arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	

}
