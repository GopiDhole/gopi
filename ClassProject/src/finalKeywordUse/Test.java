package finalKeywordUse;

public class Test {
	static int a=100;
	static final int c=20;
	int d=30;
	final int b=10;

	public static void main(String[] args) {
	
		System.out.println(a);
		System.out.println(c);
		Test t1=new Test();
		System.out.println(t1.d);
		System.out.println(t1.b);
		System.out.println("**************");
		Test t=new Test();
		t.add();
		add1();
		



	}
	 final void add()
	{
		a=a+10;
		System.out.println(a);
		//c=c+10;
		d=d+10;
		System.out.println(d);
		//b=b+10;
				
	}
	 static void add1()
		{
			a=a+20;
			System.out.println(a);
			//c=c+10;
			//d=d+10;
			//System.out.println(d);
			//b=b+10;
					
		}

}
