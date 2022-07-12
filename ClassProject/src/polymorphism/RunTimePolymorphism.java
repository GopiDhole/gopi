

package polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		a.test();
		b.test();
		a.test1();
		b.test1();
		System.out.println("===========");
		A a1=new B();
		a1.test();
		a1.test1();
		

	}

}
