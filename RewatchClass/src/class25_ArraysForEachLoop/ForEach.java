package class25_ArraysForEachLoop;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {

		int[] nums = {1,3,8,10,25};
		
		for (int element : nums) {
			element = element*element;
			System.out.print(element + "\t");
		}
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
	}

}
