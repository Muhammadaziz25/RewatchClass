package class19Braek_Debugging;

public class Quiz {

	public static void main(String[] args) {

		int k = 0;
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			while(i>3) i-=3;
			k+=1;
			System.out.println(i);
		}
		
		System.out.println(k);
		
	}

}
