package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) {
		//object creation should be done in main method
		//syntax for object creation
		//classname objectname =new classname()
		
		NonStaticMethodCall nsn=new NonStaticMethodCall(); //creating object for same class
		
		nsn.test1(); //non static regular method calling from same class
		nsn.mymethod(); //non static regular method calling from same class
		
		NonStaticSample nss=new NonStaticSample(); // creating object for another class
		
		nss.method1(); //non static regular method calling from another class using object of that class
		nss.method2(); //non static regular method calling from another class using object of that class
	}
	
	public void test1()
	
	{
	System.out.println("Hi I am test1 non static regular method from same class");	
	}
	
	public void mymethod()
	{
		System.out.println("Hi I am mymethod non static regular method from same class ");
	}
}
