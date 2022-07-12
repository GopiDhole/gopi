package inheritanceStudy;

public class MultilevelInheritance {

	public static void main(String[] args) {
		GrandFather gf=new GrandFather();
		gf.experience();
		GrandFather.stories();
		
		Father f=new Father();
		f.money();
		Father.height();
		
		f.experience();
		Father.stories();
		
		Daughter d=new Daughter();
		d.beauty();
		Daughter.naughty();
		
		d.money();
		Daughter.height();
		d.experience();
		Daughter.stories();
		

	}

}
