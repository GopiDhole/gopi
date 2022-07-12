package control_statement;

public class SwitchCaseDays {

	public static void main(String[] args) {
		//Sunday-->This is 1st day of week
		//Monday-->This is 2nd day of week
		//Tuesday-->This is 3rd day of week
		//Wednesday-->This is 4th day of week
		//Thursday-->This is 5th day of week
		//Friday-->This is 6th day of week
		//Saturday-->This is 7th day of week
		
		String day="Tuesday";
		
		switch (day) {
		case "Sunday":System.out.println("This is 1st day of week");
		break;
		
		case "Monday":System.out.println("This is 2nd day of week");
		break;
		
		case "Tuesday":System.out.println("This is 3rd day of week");
		break;
		
		case "Wednesday":System.out.println("This is 4th day of week");
		break;
		
		case "Thursday":System.out.println("This is 5th day of week");
		break;
		
		case "Friday":System.out.println("This is 6th day of week");
		break;
		
		case "Saturday":System.out.println("This is last day of week");
		break;

		default: System.out.println("Please enter a valid day");
			break;
		}
		
		int day1=5;
		
		switch (day1) {
		case 1:System.out.println("The day is Sunday");
		break;
		case 2:System.out.println("The day is Monday");
		break;
		case 3:System.out.println("The day is Tuesday");
		break;
		case 4:System.out.println("The day is Wednesday");
		break;
		case 5:System.out.println("The day is Thursday");
		break;
		case 6:System.out.println("The day is Friday");
		break;
		case 7:System.out.println("The day is Saturday");
		break;

		default:System.out.println("Enter valid no");
			break;
		}
		
		

	}

}
