package class25_ArraysForEachLoop;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] nums = {1,4,7,2,5};
		int[] newNums = new int[nums.length];
		System.out.println("nums: " + Arrays.toString(nums));
		
//		for(int i=0; i<nums.length; i++) {
//			newNums[i]=nums[i];
//		}
		
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		System.out.println("newNums: " + Arrays.toString(newNums));
		System.out.println();
	}

}
