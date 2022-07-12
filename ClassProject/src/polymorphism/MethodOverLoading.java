package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {
	MethodOverLoading m=new MethodOverLoading()	;
	m.add();
	
	m.add(20, 20);
	System.out.println("===================");
	sum();
	sum(5);

	}
	 public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	protected static void sum()
	{
		System.out.println("this is sum");
	}
	
	protected static void sum(int d)
	{
		System.out.println("this is sum d");
	}
	

}
