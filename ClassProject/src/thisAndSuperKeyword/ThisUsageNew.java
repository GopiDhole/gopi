package thisAndSuperKeyword;

public class ThisUsageNew {
	int a=20;
	int b=100;
	static int c=50;

	public static void main(String[] args) {
		//this keyword is used to access global variable  
       ThisUsageNew tun=new ThisUsageNew();
       tun.test1();
       
	}
	
	public void test1()
	{
		int a=12;
		int b=13;
		int c=15;
		System.out.println("the value of a is "+a);
		System.out.println("the value of a is "+this.a);
		System.out.println("=================");
		System.out.println("the value of b is "+b);
		System.out.println("the value of b is "+this.b);
		System.out.println("====================");
		System.out.println("the value of c is "+c);
		System.out.println("the value of c is "+ThisUsageNew.c);
	}
	

}
