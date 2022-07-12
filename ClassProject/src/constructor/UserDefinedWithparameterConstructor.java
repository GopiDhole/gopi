package constructor;

public class UserDefinedWithparameterConstructor {
	int a;
	int b;
	int c;
	
	public UserDefinedWithparameterConstructor()//user defined without parameter
	{
		a=10;
		b=30;
		c=50;
	}
	
	public UserDefinedWithparameterConstructor(int x)
	{
		a=x;
	}
	
	public UserDefinedWithparameterConstructor(int x,int y)
	{
		a=x;
		b=y;
		
	}
	public UserDefinedWithparameterConstructor(int x,int y,int z)
	{
	a=x;
	b=y;
	c=z;
	
	}

	public static void main(String[] args) {
	UserDefinedWithparameterConstructor udwp=new UserDefinedWithparameterConstructor();
	udwp.addition();
	
	UserDefinedWithparameterConstructor udpc1=new UserDefinedWithparameterConstructor(100);
	udpc1.addition();
	
	UserDefinedWithparameterConstructor udpc2=new UserDefinedWithparameterConstructor(30, 40);
	udpc2.addition();
		
	UserDefinedWithparameterConstructor udpc=new UserDefinedWithparameterConstructor(10, 20, 30);
	udpc.addition();
			
	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("The sum is "+sum);
		
		 
	}

}
