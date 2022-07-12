package interfaceStudy;

public class Demo implements MyInterface2 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.test2();
		d.test3(); 
	}

	@Override
	public void test2() {
		
		System.out.println("b");
	}

	@Override
	public void test3() {
		System.out.println("a");
		
	}

}
