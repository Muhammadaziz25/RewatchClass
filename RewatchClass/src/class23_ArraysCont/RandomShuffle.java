package class23_ArraysCont;

import java.util.Arrays;

public class RandomShuffle {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};	
		System.out.println(Arrays.toString(numbers));
		
		for(int i=numbers.length-1; i>=0; i--) {
			int m = (int)(Math.random()*(i+1));
			
			int temp = numbers[i];
			numbers[i]=numbers[m];
			numbers[m]=temp; 
		}
		System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
		
		
		

		/*int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(nums));
		
		for(int i=nums.length-1; i>=0; i--) {
			
			int j = (int)(Math.random()*(i+1));
			
			int temp = nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			
		}
		System.out.println(Arrays.toString(nums));
		*/
		
	}

}
