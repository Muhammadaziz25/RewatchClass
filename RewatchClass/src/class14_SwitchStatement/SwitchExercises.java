package class14_SwitchStatement;

public class SwitchExercises {
	public static void main(String[] args) {
		
		String day = "Wednesday";
		/*if(day.equals("Monday") || day.equals("Tuesday" )|| day.equals("Wednesday" )
				|| day.equals("Thursday" )|| day.equals("Friday" )){
			System.out.println("Work day");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Weekend");
		} else {
			System.out.println("Invalid day");
		}
*/		
		switch(day) {
		case "Monday":
			System.out.println("Workday");
			break;
		case "Tuesday":
			System.out.println("Workday");
			break;
		case "Wednesday":
			System.out.println("Workday");
			break;
		case "Thursday":
			System.out.println("Workday");
			break;
		case "Friday":
			System.out.println("Workday");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid day");
		}
	}
}
