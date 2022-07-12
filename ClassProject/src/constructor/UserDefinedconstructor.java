package constructor;

public class UserDefinedconstructor {
	int a; // variable declaration
	int b; //variable declaration
	static int c;
	static int d;
	UserDefinedconstructor()
	{
		//user defined contractor
		//the constructor is called when an object of a class is created
		System.out.println("Hi UserDefinedConstructor is running");
		//initialize data member/variable
		a=1000;
		b=800;
		c=500;
		d=200;
	}
	

	public static void main(String[] args) {
	
		UserDefinedconstructor ud=new UserDefinedconstructor(); // object created of class
				ud.add();
				 sub();
     
	}

	public void add()
	{
		int sum=a+b; //value of a and b is received from constructor
		System.out.println("sum is "+sum);
	}
	public static void sub()
	{
		int sub=c-d;
		System.out.println("sub is "+sub);
	}
}
