package class33_VarArgsCon;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
		
		ClassA classA  =new ClassA();
		
		System.out.println(classA.firstName);
		System.out.println(classA.lastName);
	}

}
