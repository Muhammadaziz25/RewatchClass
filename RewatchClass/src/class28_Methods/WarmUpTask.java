package class28_Methods;

public class WarmUpTask {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 1, 25, 10, 5, 7, 2, 10 };

		for (int i = 0; i < nums.length - 1; i++) {
			int dup = nums[i];
			int dup2 = nums[i + 1];

//			inner:
//			for (int j = i+1; j < nums.length; j++) {
//				int dup2=nums[j];

			if (dup == dup2) {
				System.out.print(dup + ", ");

			}
		}
	}

}
