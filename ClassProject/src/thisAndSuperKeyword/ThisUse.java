package thisAndSuperKeyword;

public class ThisUse {
	int a=10;
	static int b=99;

	public static void main(String[] args) {
	ThisUse tu=new ThisUse();
	tu.test();

	}
	public void test()
	{
	   int a=100;
	   int b=50;
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);
		
		int add1=1+a;
		System.out.println("value of add1 is "+add1);
		
		int add2=1+this.a;
		System.out.println("value of add2 is "+add2);
		System.out.println("=========================");
		
		System.out.println("the value of b is "+b);
		System.out.println("the value of b is "+ThisUse.b);
	}

}
