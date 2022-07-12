package interfaceStudy;

public class SubImpClass  implements MyInterface3{

	public static void main(String[] args) {
	SubImpClass sic=new SubImpClass()	;
	sic.test1();
	sic.test2();
	sic.test5();
	sic.test6();
		

	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2");
		
	}

	@Override
	public void test5() {
		System.out.println("test5");
		
	}

	@Override
	public void test6() {
		System.out.println("test6");
		
	}

}
