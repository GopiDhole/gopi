package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int orgNum=123;
		int revNum=0;
		
		for(int i=orgNum;i>=0;i=i/10)
		{
			int rem=i%10;//3,2,1
			
			revNum=revNum*10+rem;
			//3=3+0
			//32=3*10+2
			//321=320+1
		}
		System.out.println("Original Number is "+orgNum);
		System.out.println("reverse Number is "+revNum);
	}

}
