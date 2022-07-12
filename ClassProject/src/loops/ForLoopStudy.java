package loops;

public class ForLoopStudy {

	public static void main(String[] args) {
		// print number 0-10 and increment by 1
		//for(initialization;condition;updation)
		
		for(int a=0;a<=10;a++)
		{
			System.out.println(a);
		}
		
		//print table of 2
		for(int a=2;a<=20;a=a+2)
		{
			System.out.println(a);
		}
		
		//print number 10-0 and start at 10 decrement by 1
		for(int a=10;a>=0;a--)
		{
			System.out.println(a);
		}
		
		//print table of 5 in reverse order
		for(int a=50;a>=0;a=a-5)
		{
			System.out.println(a);
		}
		//print velocity 5 times
		for(int a=1;a<=5;a++)
		{
			System.out.println("VELOCITY");
		}
		
		//print table of 6 
		for(int b=6;b<=60;b=b+6)
		{
			System.out.println(b);
		}
		
		//print table of 6 in decrement order
		for(int c=60;c>=6;c=c-6)
		{
			System.out.println(c);
		}
		//print PaRaS 5 times
		for(int d=0;d<=5;d++)
		{
			System.out.println("PaRaS");
		}
		
		//full table of 2
		int u=2;
		for(int v=1;v<=10;v++)
		{
			System.out.println(u+"x"+v+"="+v*u);
		}
	}

}
