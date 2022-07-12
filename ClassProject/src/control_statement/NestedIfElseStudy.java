package control_statement;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		// if UN is valid-->enter PWD
		//if PWD is valid-->login success
		//else PWD is invalid-->incorrect PWD
		//else UN is invalid-->incorrect UN
		
		String UN="Velocity";
		String PWD="Velocity@12";
		long mobile=987654321l;
		
		if(UN=="Velocity") //outer loop
		{
			System.out.println("Enter Password");
			
			if(PWD=="Velocity@123")// inner loop
			{
				System.out.println("Login success");
			}
			
			else
			{
				System.out.println("incorect PWD");
			}
			if(mobile==9876543210l)//inner loop
			{
				System.out.println("matched ");
			}
			else 
			{
				System.out.println("not matched");
				
			}
			
		}
		else
		{
			System.out.println("incorrect UN");
			
		}
		
			

	}

}
