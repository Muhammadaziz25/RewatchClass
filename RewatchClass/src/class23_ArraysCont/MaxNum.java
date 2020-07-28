package class23_ArraysCont;import java.util.Arrays;

public class MaxNum {

	public static void main(String[] args) {

		/*int[] nums = {5,6,15,65,9,48};
		int max = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("The maximum number is " + max);*/
		
		double[] nums = {5.417038865751068, 9.888521337240846, 7.210395737623941, 9.84488481460523,
				6.665853260132394, 4.795709572756421, 4.017399596911488};
		double max = nums[0];
		int arrayOfIndex = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				max=nums[i];
				arrayOfIndex = i;
			}
		}
		System.out.println("The max number is " + max);
		System.out.println("Index of " + max + " is " + arrayOfIndex);
		
	}

}
