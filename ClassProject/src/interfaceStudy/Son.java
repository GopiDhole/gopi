package interfaceStudy;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		Son s=new Son();
		s.love();
		s.money();
		s.nature();
		s.cash();
		System.out.println("===============");
		Father.cash();
		Mother.cash();

	}

	@Override
	public void nature() {
		System.out.println("Mother interface method completed in Son class");
		
	}

	@Override
	public void money() {
		
		Father.super.money();
		Mother.super.money();
	}

	@Override
	public void love() {
		
		System.out.println("FAther interface method completed in Son class");
	}
	public void cash()
	{
		System.out.println("fathers cash");
		Father.cash();
		Mother.cash();
	}

}
