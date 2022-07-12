package logicalPrograms;

public class FactorialaOfNumber {

	public static void main(String[] args) {
		//4!=4*3*2*1
		
		int num=6;
		int num1=1;
		
		for(int i=num;i>=1;i--)
		{
			num1=num1*i;
		}
		System.out.println("Factorial of number is "+num1);
	}

}
