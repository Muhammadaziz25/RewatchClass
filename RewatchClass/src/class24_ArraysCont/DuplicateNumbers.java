package class24_ArraysCont;

/**
 * 22.02.2020
 * 
 * @author Eagle
 *
 */

public class DuplicateNumbers {

	public static void main(String[] args) {
		/*int[] nums = { 2, 5, 4, 5, 3, 6 };
		int count = 0;
		for (int x = 0; x < nums.length - 1; x++) {
			if (nums[x] == nums[x + 1]) {
				count++;
				System.out.println("The dubplicate numbers is on index= " + x + " the duplicate number is " + nums[x]);
			}
		}*/

		
		int[] nums = new int[7];
		nums[0] = 5;
		nums[1] = 86;
		nums[2] = 10;
		nums[3] = 5;
		nums[4] = 25;
		nums[5] = 17;
		nums[6] = 25;

		outter: for (int i = 0; i < nums.length; i++) {
//			int dup = nums[i];

			inner: for (int m = i + 1; m < nums.length; m++) {
//				int dup2 = nums[m];

				if (nums[i] == nums[m]) {
					System.out.println("--> " + nums[i]);
					break inner;
				}
			}
		}
		 

		/*
		 * int[] numbers = new int [5]; numbers[0]= (int)(Math.random()*10);
		 * System.out.println(numbers[0]); numbers[1]= (int)(Math.random()*10);
		 * System.out.println(numbers[1]); numbers[2]= (int)(Math.random()*10);
		 * System.out.println(numbers[2]); numbers[3]= (int)(Math.random()*10);
		 * System.out.println(numbers[3]); numbers[4]= (int)(Math.random()*10);
		 * System.out.println(numbers[4]);
		 * 
		 * outter: for(int i=0; i<numbers.length; i++) { int temp=numbers[i]; inner:
		 * for(int m=i+1; m<numbers.length; m++) { int temp2=numbers[m]; if(temp==temp2)
		 * { System.out.println("-----> " + temp); break outter; } } }
		 */
	}

}
