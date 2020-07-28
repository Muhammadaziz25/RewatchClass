package class21_Arrays;

public class ArrayIntro {

	public static void main(String[] args) {

		int[] numbers = new int[5];
		
		numbers[0]=5;
		numbers[1]=7;
		numbers[2]=10;
		numbers[3]=11;
		numbers[4]=17;
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("Index " + i + " is " + numbers[i] + "\t");
		}
		
		
		
	}

}
