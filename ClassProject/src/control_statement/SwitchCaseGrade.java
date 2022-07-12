package control_statement;

public class SwitchCaseGrade {

	public static void main(String[] args) {
		//A-->You get marks between 70 to 100
		//B-->You get marks between 60 to 70
		//C-->You get marks between 50 to 60
		//D-->You get marks between 40 to 50
		
		char grade='C';
		
		switch (grade) {
		case 'A':System.out.println("You get marks >=70 & <=100");
		break;
		case'B':System.out.println("You get marks >=60 & <70");
		break;
		case 'C':System.out.println("You get marks >=50 & <60");
		break;
		case 'D':System.out.println("You get marks >40 & <50");
		break;

		default:System.out.println("Enter valid grade");
			break;
		}

	}

}
