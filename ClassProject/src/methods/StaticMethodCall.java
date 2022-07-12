package methods;

public class StaticMethodCall {

	public static void main(String[] args) {
		
		sample(); //calling static regular method from same class-->methodname();
		
		test(); //calling static regular method from same class -->methodname();
		
		StaticStudy.myMethod(); //calling static regular method from another class-->classname.methodname();
		
		StaticStudy.display(); //calling static regular method from another class-->classname.methodname();
	}

	public static void sample() // regular static method
	{
		System.out.println("Hi I am regular static method");
	}
	
	public static void test() // regular static method
	{
		System.out.println("Hi I am regular static test method");
	}
	
}
