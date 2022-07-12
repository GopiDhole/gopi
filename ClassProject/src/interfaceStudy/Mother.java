package interfaceStudy;

public interface Mother {
	
	void nature();
	
	default void money()
	{
		System.out.println("Mothers money");
	}

	static void cash() {
		System.out.println("mother cash");
		
	}

}
