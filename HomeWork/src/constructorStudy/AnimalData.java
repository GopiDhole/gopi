package constructorStudy;

public class AnimalData {

	public static void main(String[] args) {
		AnimalData an=new AnimalData();
		an.cat("billo",4.5f,25.2f,"white"); 
			
	}
	
	public void cat(String name, float age, float height, String colour)
	{
	System.out.println("===============AnimalData=================");
	System.out.println("The name of the cat is :"+name);
	System.out.println("Age of the cat is      :"+age +" months");
	System.out.println("Height of the cat is   :"+height +"cm");
	System.out.println("Colour of the cat is   :"+colour);
	System.out.println("==========================================");	
		
	}
	
	
	
}
