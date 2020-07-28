package stringManipulation;

import java.util.Calendar;

public class StringExercise {
	
	public static void main(String[] args) {
		
		String currentTime = Calendar.getInstance().getTime().toString();
		System.out.println(currentTime);
		
		//System.out.println(currentTime.indexOf(' ')+1);
		int indexOfSpace = currentTime.indexOf(' ');
		int indexOfSecondSpace = currentTime.indexOf(' ', indexOfSpace+1);
		//System.out.println(indexOfSecondSpace);
		int indexOfThirdSpace = currentTime.indexOf(' ', indexOfSecondSpace+1);
		//System.out.println(indexOfThirdSpace);
		//System.out.println(currentTime.substring(indexOfThirdSpace+1, currentTime.length()-9));
		int indexOfFourthSpace = currentTime.indexOf(' ', indexOfThirdSpace+1);
		String time = currentTime.substring(indexOfThirdSpace+1, indexOfFourthSpace);
		int year = currentTime.length()-4;
		System.out.println("The current time is " + time + " and the current year is " + 
				currentTime.substring(24));
	}

}
