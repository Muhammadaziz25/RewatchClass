package class21_Arrays;

public class AssignmentWithLoop {
	
	public static void main(String[] args) {
		
		int arrayLength = 100;
		int[] nums = new int[arrayLength];
		int sum =0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=i+1;
			System.out.println(nums[i]);
			sum += nums[i];
		}
		System.out.println(sum);
		
		double average = sum/100.0;
		System.out.println(average);
		
		int count=0;
		for(int c=0; c<nums.length; c++) {
			if(nums[c]>average) {
				count++;
				
			}
		}
		System.out.println(count);
		
		
		/*int sum = 0;
		int arrayLength = 100;
		int[] nums = new int[arrayLength];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = i+1;
			sum += nums[i];
			System.out.println("Index " + i + " is " + nums[i]);
			
		}
		System.out.println(sum);
		double average = sum/100.0;
		System.out.println(average);
		
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > average) {
				count++;
			}
		}
		System.out.println(count);*/
	}

}
