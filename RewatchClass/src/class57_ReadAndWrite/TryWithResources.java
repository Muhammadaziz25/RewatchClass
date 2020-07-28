package class57_ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Eagle\\Desktop\\file.txt");
		
		try(PrintWriter p = new PrintWriter(f);
				Scanner s = new Scanner(f)) {
			p.println("Sony");
			p.println("Samsung");
			p.println("iPhone");
			
			while(s.hasNext()) 
				System.out.println(s.nextLine());
			
				
		}catch(FileNotFoundException e) {
			System.out.println("Exception has caught");
			
		}
		
		System.out.println("After try catch exception");
		
	}
	
	

}
