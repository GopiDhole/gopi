package methods;

public class ChennaiSuperKings {

	public static void main(String[] args) {
		
	playerInfo("Ruturaj Gaikwad",25.2f,"Right-Handed batsman","Indian",31);	
	playerInfo("Mahendra Singh Dhoni",40.9f,"Right-Handed batsman","Indian",7);
	
	ChennaiSuperKings pI=new ChennaiSuperKings(); //created object for calling the non static regular method with parameters
	pI.playerInfo1("Devon Philip Conway",30.9f,"Left-Handed batsman","New Zealand",88);
	pI.playerInfo1("Moeen Munir Ali",34.8f,"Left-Handed batsman","England",18);

	}

	public static void playerInfo(String Name, float Age,String Role,String Nationality,int TshirtNo) //static regular method with parameters
	{
	System.out.println("==================================================");
	System.out.println("The player name is           :"+Name);
	System.out.println("The Age of player is         :"+Age);
	System.out.println("The role of Player is        :"+Role);
	System.out.println("The Nationality of player is :"+Nationality);
	System.out.println("The T-shirt No. of player is :"+TshirtNo);
	System.out.println("==================================================");
	}
	
	public void playerInfo1(String Name, float Age,String Role,String Nationality,int TshirtNo) //non static regular method with parameters
	
	{
		System.out.println("==================================================");
		System.out.println("The player name is           :"+Name);
		System.out.println("The Age of player is         :"+Age);
		System.out.println("The role of Player is        :"+Role);
		System.out.println("The Nationality of player is :"+Nationality);
		System.out.println("The T-shirt No. of player is :"+TshirtNo);
		System.out.println("==================================================");	
	}
}
