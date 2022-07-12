package methods;

public class MathOperation {

	public static void main(String[] args) {
		// 1. calling method from same class
		//2. calling method from different class
		
		MathOperation adn=new MathOperation(); //creating object for non static regular method for same class
		adn.addition(); // calling non static regular method from same class
		subt(); // calling static regular method from same class
		
		MathOpClass mud=new MathOpClass(); //creating object for non static regular method from different class
		mud.multiplication(); // calling non static regular method from another class
		MathOpClass.division(); // calling static regular method from another class

	}

	
	public void addition() //non static regular method
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println("addition is "+add);
	}
	
	public static void subt() // static regular method
	{
		int x=50;
		int y=20;
		int sub=x-y;
		System.out.println("subtraction is "+sub);
	}
}
