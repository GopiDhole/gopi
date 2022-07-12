package methods;

public class MathOpClass {
	
	public void multiplication() //non static regular meethod
	{
		int p=5;
		int q=29;
		int mul=p*q;
		System.out.println("multiplication is "+mul);
	}

	public static void division() //static regular method
	{
		int u=125;
		int v=5;
		int div=u/v;
		System.out.println("division is "+div);
	}
}
