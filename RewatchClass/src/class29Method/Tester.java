package class29Method;

import class28_Methods.MethodsDemo;

public class Tester {

	public static void main(String[] args) {

//		SumOfInt.sum(10, 70);
//		SumOfInt.sum(100, 700);
//		
//		MethodsDemo.greeting("evening");

		printMessage("Assalamu alaykum", 10, true);

	}

	public static void printMessage(String message, int times, boolean isOneLine) {
//		if (isOneLine) {
		for (int i = 0; i < times; i++) {
			System.out.print(isOneLine ? (i + 1) + ": " + message + ", " : (i + 1) + ": " + message + "\n");
		}
//		} else {
//			for (int i = 0; i < times; i++) {
//				System.out.println((i+1) + ": " + message);
//			}

	}

}
