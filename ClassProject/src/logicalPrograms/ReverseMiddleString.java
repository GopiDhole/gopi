package logicalPrograms;

public class ReverseMiddleString {

	public static void main(String[] args) {
		//reverse even position strings
		String s="I LOVE MY INDIA";
		String ar[]=s.split("");
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0) //odd index
			{
				String s1=ar[i];
				ar[i]=revStr(s1);
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+"");
		}

	}
	public static String revStr(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		 return rev;
	}

}
