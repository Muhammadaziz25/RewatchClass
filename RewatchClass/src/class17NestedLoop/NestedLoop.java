package class17NestedLoop;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		/*for(int i=0; i<10; i++) {
			System.err.println("Outer loop " + i);
			
			for(int j=0; j<5; j++) {
				System.out.print("Inner loop " + j + "\t");
			}
			System.out.println();
		}*/
		
		for(int i = 1; i<=9; i++) {
			
			for(int m = 1; m<=9; m++) {
				
				System.out.print(m*i + "\t");
			}
			System.out.println();
		}
		
	}

}
