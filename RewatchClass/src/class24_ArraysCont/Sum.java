package class24_ArraysCont;

public class Sum {

	public static void main(String[] args) {

		int[] nums = {1,5,57,7,98};
		int sum =0;
		for(int i=0; i<nums.length; i++) {
			/*sum +=nums[i]; sum = sum + nums[i];*/ sum = sum + nums[i];
		}
		System.out.println("The summary is " + sum);
	}

}
