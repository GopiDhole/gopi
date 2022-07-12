package inheritanceStudy;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Mother1 m1=new Mother1();
		m1.strict();
		Mother1.kindness();
		System.out.println("=================");
		
		Son1 s1=new Son1();
		s1.handsome();
		Son1.cool();
		s1.strict();
		Son1.kindness();
		System.out.println("==================");
		
		Daughter2 d2=new Daughter2();
		d2.scooty();
		Daughter2.dance();
		d2.strict();
		Daughter2.kindness();
		

	}

}
