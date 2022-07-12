package abstractClass;

public abstract class CC extends Sample {

	public static void main(String[] args) {
//		CC c=new CC();
//		c.test();//method from sample
//		c.test1();//method from CC
//		c.demo();//method from CC

	}

	@Override
	public void test1() 
	{
		
		System.out.println("This method is completed in concrete class");
	}
	public void demo()
	{
		System.out.println("method from CC");
	}
	
	public abstract void test2();//incomplete method
	
	@Override
	public void test3()
	{
		System.out.println("this method is from sample class");
	}
    
    
    
	

}
