package class31PassByValueOverloading;

public class Task {

	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		swap(a, b);
		
		System.out.println("a is: " + a  + " b is: " + b);
		

	}
	
	public static void swap(int num1, int num2) {
		System.out.println("Before swapping num1 is " + num1 + " num2 is " + num2);
		int temp;
		temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping num1 is " + num1 + " num2 is " + num2);
		
	}

}
