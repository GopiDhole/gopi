package interfaceStudy;

public class MyClass implements MyInterface{

	public static void main(String[] args) {
	MyClass m=new MyClass();//created object of implementation class
	m.test();
	m.test1();
	}
	public void test()
	{
		System.out.println("test method completed in implementation class");
	}
    public void test1()
{
	System.out.println("test1 method completed in implemetation class");
}
}
