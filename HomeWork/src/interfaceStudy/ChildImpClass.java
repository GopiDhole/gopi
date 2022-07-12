package interfaceStudy;

public class ChildImpClass implements MyInterface,MyInterface1{

	public static void main(String[] args) {
	ChildImpClass cic=new ChildImpClass();
	cic.test3();
	cic.test4();
	cic.test1();
	cic.test2();

	}

	@Override
	public void test3() {
		System.out.println("test3");
		
	}

	@Override
	public void test4() {
		System.out.println("test4");
		
	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2");
		
	}

}
