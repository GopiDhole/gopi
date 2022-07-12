package control_statement;

public class Test1 {

	public static void main(String[] args) {
	
		int marks=20;
		if(marks>=60 & marks<100)
		{
			System.out.println("You are in distinction");
		}
		else if(marks>=50 & marks<60)
		{
			System.out.println("You are in 1st class");			
		}
		else if(marks>=40 & marks<50)
		{
			System.out.println("You are pass");			
		}
		else if(marks>100)
		{
			System.out.println("Invalid marks range, Please enter valid value between 0 and 100");			
		}
		else
		{
			System.out.println("You are fail");
		}

	}

}
