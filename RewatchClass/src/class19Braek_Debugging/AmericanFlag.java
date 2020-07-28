package class19Braek_Debugging;

public class AmericanFlag {

	public static void main(String[] args) {
		
		
		
		for(int i =0; i<=15; i++) {
			
			for(int j =0; j<50; j++) {
				
				if(j <= 10 && i <=5) {
					System.out.print("*");
				    continue;
				}
					System.out.print("=");
				
			}
			System.out.println();
		}

	}

}
