package control_statement;

public class SwitchCase {

	public static void main(String[] args) {
		//1--> Welcome to 1st Yr Engineering
		//2--> Welcome to 2nd Yr Engineering
		//3--> Welcome to 3rd Yr Engineering
		//3--> Welcome to 4th Yr Engineering
		
		int year=3;
		
		switch (year) {
		case 1:System.out.println("Welcome to 1st yr Engineering");
		break;
			
		case 2:System.out.println("Welcome to 2nd yr Engineering");
		break;
			
		case 3:System.out.println("Welcome to 3rd yr Engineering");
		break;
			
		case 4:System.out.println("Welcome to 4th ye Engineering");
		break;	

		default:System.out.println("Please enter ye between 1 to 4");
			break;
		}
		

	}

}
