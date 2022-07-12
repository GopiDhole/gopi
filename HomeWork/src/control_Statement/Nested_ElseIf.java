package control_Statement;

public class Nested_ElseIf {

	public static void main(String[] args) {
		//5 students Ram1,Ram2,Ram3,Ram4,Ram5
		//if teacher asked 1st student --> if he is able to give answer--> good
		//else teacher ask to 2nd student-->if he is able to give the answer--good
		//else teacher ask to 3rd student--> if he is able to give the answer-->good
		//else teacher ask to 4th student-->if he is able to give the answer-->good

		String name1="Ram1";
		String name2="Ram2";
		String name3="Ram3";
		String name4="Ram4";
		
		
		if(name1=="Ram3")//outer loop
		{
			System.out.println("Good");
		}
		else if(name2=="Ram2")//inner loop
		{
			System.out.println("vGood");
		}
		else if(name3=="Ram3")
		{
			System.out.println("vvGood");
			
		}
		else if(name4=="Ram4")
		{
			System.out.println("vvvgood");
		}
		else
		{
			System.out.println("No good");
		}
	}

}
