package control_statement;

public class ElseIfStudy {

	public static void main(String[] args) {
		//if marks >=60-->you are in dist
		//if marks >50-->1st class
		//if marks >40-->pass
		//else you are fail
		
		int marks=35;
				if (marks>=60)
				{
					System .out.println("you are in distinction");
				}
					
				else if(marks>=50)
					{
					System.out.println("you are in 1st class");
					}
				else if(marks>=40)
				{
					System.out.println("you are pass");
				}
				else if(marks<40 & marks>=0)
					{
					System.out.println("you are fail");
					}
				else 
				{
					System.out.println("You are fail");
				}
					
				
		
	}

}
