import java.util.Scanner;

public class ReverseStudy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		 int num=sc.nextInt(); //1234
		 
		 //1. using algorithm
//		 int rev=0;
//		 while(num!=0)
//		 {
//			 rev=rev*10+num%10;
//			 num=num/10;
//		 }
//		 System.out.println("Reverse number is: "+rev);
		 
		 //2. using StringBuffer class
		
		/* StringBuffer sb=new StringBuffer(String.valueOf(num));
		 StringBuffer rev1=sb.reverse();
		 System.out.println("Reverse number is :"+rev1);*/
		 
		 //3. using StringBuilder class
		 
		 StringBuilder sbl=new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev = sbl.reverse();
		 System.out.println("Reverse Number is "+rev);

	}

}
