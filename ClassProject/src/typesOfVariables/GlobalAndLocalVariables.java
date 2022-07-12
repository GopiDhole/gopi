package typesOfVariables;

public class GlobalAndLocalVariables {
	
	/*Types of variables
	 * 1. Global Variables:- Outside the method/block/constructor, scope is throughout the class, also called as permanent variable
	 * 2. Local Variables:- Inside the method/block/constructor,scope is only for method/block/constructor, also called as temporary variables 
	 * 3. Static VAriables
	 * 4. Non-static Variables
	 */
	
	int a=100; //global non-static variables
	static int b=100; //global static variables
	static int c;
	

	public static void main(String[] args) {
		
		GlobalAndLocalVariables gac=new GlobalAndLocalVariables(); //create an object of a class
		System.out.println("Value of a is        :"+gac.a); // calling non-static global variables from same class
		
		System.out.println("Value of b is        :"+b); // calling static global variables from same class
		
		Test t=new Test();
		System.out.println("Value of the x is    :"+t.x); // calling non static global variables from another class 
		
		System.out.println("Value of the y is    :"+Test.y); // calling static global variables from another class
		
		GlobalAndLocalVariables glv=new GlobalAndLocalVariables();
		glv.addition();
		glv.sub();

		int mul=b*gac.a;
		System.out.println("the value of mul is "+mul);

	}
	public void addition()
	{
		int p=10;
		int sum=p+10;// p is local variable known to addition method only
		System.out.println("the value of sum is  :"+sum);
		
		int sum1=a+20; //a is global variable known to whole class
		System.out.println("the value of sum1 is :"+sum1);
		c=10;
		int sum2=b+c;
	
		System.out.println("the sum of sum2 is "+sum2);
	}
	public void sub()
	{
		int q=20; // q is the local variable known to sub method only
		int sub=a-q; // a is global variable known to whole class
		System.out.println("the value of sub is  :"+sub);					
	}
	

}
