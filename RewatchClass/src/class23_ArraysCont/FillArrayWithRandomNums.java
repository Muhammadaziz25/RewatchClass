package class23_ArraysCont;

import java.util.Arrays;

public class FillArrayWithRandomNums {

	public static void main(String[] args) {
		
		/*char[] ch = new char[100];
		System.out.println(Arrays.toString(ch));
		
		for(int i=0; i<ch.length; i++) {
			ch[i]=(char)(33+(Math.random()*94));
		}
		System.out.println(Arrays.toString(ch));*/

		double[] nums = new double[8];
		System.out.println(Arrays.toString(nums));
		
		double max = nums[0];
		for(int i=0; i<nums.length; i++) {
			nums[i]=(Math.random()*10);
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(max);
	}

}
