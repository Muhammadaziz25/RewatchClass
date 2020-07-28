package class19Braek_Debugging;

public class Break {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		
		for(i=0; i<10; i++) {
			
			
			if(sum>=25) 
				break;
			
			sum += i;
			}
		
		System.out.println("i is " + i);
		System.out.println("sum is " + sum);
		}
	}


