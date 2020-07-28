package class25_ArraysForEachLoop;

public class LinearSearch {

	public static void main(String[] args) {

		int[] numbers = {2,10,7,20,25,665,98,32,34,17,5};
		int key = 250;
		
		int indexOfMatch = -1;
		
		for(int i=0; i<numbers.length; i++) {
			if(key==numbers[i]) {
				indexOfMatch = i;
				break;
			}
		}
		
			System.out.println(indexOfMatch>=0 ? "The key element's index is: " + indexOfMatch: "No match");
		}
	}

