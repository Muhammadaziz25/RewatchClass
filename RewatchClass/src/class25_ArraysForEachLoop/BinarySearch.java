package class25_ArraysForEachLoop;

public class BinarySearch {

	public static void main(String[] args) {

		int[] numbers = {10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
		
		int key = 70;
		int start = 0;
		int end = numbers.length-1;
		
		int indexOfKey = -1;
		
		while(end>=start) {
			
			int mid = (start+end)/2;
			
			if(key<numbers[mid]) {
				end = mid-1;
				
			}else if(key==numbers[mid]) {
				indexOfKey=mid;
				break;
				
			}else {
				start=mid+1;
			}
		}
		System.out.println(indexOfKey>=0 ? "The index of key is: " + indexOfKey : "Match not found" );
	}

}
