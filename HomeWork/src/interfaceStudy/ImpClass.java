package interfaceStudy;

public class ImpClass implements MyInterface {

	
	
	public static void main(String[] args) {
		//one class can implement interface
		
		System.out.println(a);// calling variable of interface 
		ImpClass ic=new ImpClass(); //creating object of implementation class
		ic.test1();
		ic.test2();
		test3();
		ic.test3(10);
		
		

	}

	@Override
	public void test1() {
		System.out.println("the completed method test1");
		
	}

	@Override
	public void test2() {
		System.out.println("the completed method of test2");		
	}
	 public static void test3()
	 {
		 System.out.println("the completed method of its own class");
	 }
	  void test3(int a)
	 {
		 System.out.println("the completed method of its own class");
	 }


}
