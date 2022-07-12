package abstractClass;

public class Test22 extends CC{

	public static void main(String[] args) {
	Test22 t=new Test22();
	t.test2();
	t.test1();
	t.demo();
	t.test3();
	test4();
	}

	@Override
	public void test2() {
		System.out.println("This is concrete class for CC");
		
	}

	@Override
	public void test3() {
		System.out.println("This is concrete method for test3 in test2");
		
	}
	
	public static void test4()
	{
		System.out.println("This is own metnod of Test2");
		
	}
	
	

	

}
