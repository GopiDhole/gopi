
public class RevStringStudy {

	public static void main(String[] args) {
		//1. using (String Concatanation) operator
		String str="ABCD";
		String rev="";
		/*int len= str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is "+rev);*/
		
		//2. using character array
		/*char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		} 
		System.out.println("Reversed String is "+rev);*/
		
		//3.using StringBuffer Class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		

	}

}
