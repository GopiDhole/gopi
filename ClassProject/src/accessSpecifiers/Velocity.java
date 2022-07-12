package accessSpecifiers;

public class Velocity {

	public static void main(String[] args) {
	Velocity v=new Velocity();
	v.test1();//calling private method-->(visible only within class)
	v.test2();//calling dafault method-->(visible within package)
	v.test3();//calling protected method-->(visible within package-->using inheritance will provide out of package)
	v.test4();//calling public method-->(visible throughout project)

	}
	private void test1()
	{
		System.out.println("I am private method test1");
	}
	void test2()
	{
		System.out.println("I am default method test2");
	}
	protected void test3()
	{
		System.out.println("I am protected method test3");
	}
	public void test4()
	{
		System.out.println("I am public method test4");
	}

}
