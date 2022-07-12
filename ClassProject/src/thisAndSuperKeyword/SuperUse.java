package thisAndSuperKeyword;

public class SuperUse extends A {
	int p=120;

	public static void main(String[] args) {
	SuperUse su=new SuperUse();
	su.test();

	}
	public  void test()
	{
		int p=1;
		System.out.println("Local value of p is "+p);
		System.out.println("Global value of p from same class is "+this.p);
		System.out.println("Global value of p from another class is "+super.p);
	}

}
