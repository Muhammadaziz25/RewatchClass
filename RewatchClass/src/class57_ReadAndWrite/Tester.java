package class57_ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException{
		
		File f = new File("car.txt"); //C:\Users\Eagle\Desktop
		System.out.println(f.exists());
		PrintWriter p = new PrintWriter(f);
		System.out.println(f.exists());
		p.println("Mercedes Benz");
		p.println("Audi");
		p.println("BMW");
		
		p.close();
		
		Scanner s = new Scanner(f);
		while(s.hasNext())
		System.out.println(s.nextLine());
		
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		File f = new File("file.txt");
//		System.out.println(f.exists());
//		PrintWriter pw = new PrintWriter(f);
//		System.out.println(f.exists());
//		pw.println("Mercedes Benz");
//		pw.println("Audi");
//		pw.println("BMW");
//		
//		pw.close();
//		
//		Scanner s = new Scanner(f);
//		while(s.hasNext())
//		System.out.println(s.nextLine());
//				
	}

}
