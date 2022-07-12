package interfaceStudy;

abstract interface Father {
	
	void love();
	
default void money()
{
		System.out.println("Fathers money");
}
static void cash()
{
	System.out.println("fathers cash");
}
}
