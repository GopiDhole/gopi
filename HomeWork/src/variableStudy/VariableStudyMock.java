package variableStudy;

public class VariableStudyMock {
	int a=20; //non static global variable
	static int b=30; //static global variable
	static int e=10;//static global variables
	
	public static void main(String[]args)
	{
	VariableStudyMock	vsm=new VariableStudyMock();
	System.out.println("the value of a is "+vsm.a); // calling non static variable for same class
	
	System.out.println("the value of b is "+b);// calling static variable for same class
	
	VariableStudyMock vs=new VariableStudyMock();
	vs.addition(); // calling non static method for same class
	
	sub();//calling static method from same class
	
	VariableStudyMock2 vsm2=new VariableStudyMock2();
	System.out.println("the value of p is "+vsm2.p); //calling non static variable from different class
	
	System.out.println("the value of q is "+VariableStudyMock2.q);//calling static variable from different class
	
	VariableStudyMock2.man();
	
	vsm2.Woman();
	
	
	}
	
	 
	public void addition()
	{
	int c=a+b;
	System.out.println("the value of c is "+c);
	
	}
	public static void sub()
	{
		int d=b-e;
		System.out.println("the value of d is "+d);
		
	}
	
	

	
}
