package constructor;

public class DefaultConstructor {

//	public CC1()
//	{
//		//default constructor-->created by compiler
//  }
	
	public static void main(String[] args) {
		DefaultConstructor c1=new DefaultConstructor(); 
		c1.info();
	}
	public void info()
	{
		System.out.println("default constructor is inbuilt contructor");
	}
}
