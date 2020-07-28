package class28_Methods;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; ) {
//			i++;
//			System.out.println(i);
//			
//		}
//		
//		int k = 0;
//		for (int i = 10; i > 0; i--) {
//			while(i>3) {
//				i -= 3;
//			}
//			System.out.println(i);
//			k += 1;
//		}
//		System.out.println(k);
		
		int[] arr = {1, 4, 7, 2, 5, 8, 3};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			System.out.print(num + ", ");
			
		}
		
		
	}

}
