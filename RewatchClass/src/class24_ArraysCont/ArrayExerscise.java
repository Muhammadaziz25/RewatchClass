package class24_ArraysCont;

import java.util.Arrays;

public class ArrayExerscise {

	public static void main(String[] args) {
		
		String str = "10,8,20,17,7";
		String[]s = str.split(",");
		System.out.println(Arrays.toString(s));
		System.out.println(s.length);
		
		for(String each : s) {
			int age = Integer.parseInt(each);
			if(age>=15) {
				System.out.println("You are older than 15");
			}else {
				System.out.println("You are not older than 15");
			}
		}
		
		
		

//		String str = "10,25,12,34,14";
//		String[] st = str.split(",");
//		System.out.println(Arrays.toString(st));
//		System.out.println(st.length);
//		for(String temp : st) {
//			int age = Integer.parseInt(temp);
//			if(age >=18) {
//				System.out.println("You are older than 18");
//			}else {
//				System.out.println("You are not older than 18");
//			}
//			
//		}
	}

}
