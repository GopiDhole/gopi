package methods;

public class PuneUniversity {

	public static void main(String[] args) {
	
		PuneUniversity pu=new PuneUniversity(); //created object of the class
		pu.studentInfo(); //calling non static method without parameter
		pu.studentInfo("Paras","PU12341234","safety",1,'A');
		pu.studentInfo("Yogita","AP90082345","m.tech",2,'A');
		pu.bioData("Priyanka", 5.7f, 33.2f, "fair");
	}

	public void studentInfo() //non static regular method
	{
		//Name;PRN;Course;Year;Grade
		
		String name="Gopi";
		String PRN="PU12041004";
		String course="Engineering";
		int year=4;
		char grade='A';
		System.out.println("=====================");
		System.out.println("My Name is "+name);
		System.out.println("My PRN is "+PRN);
		System.out.println("I am in "+course);
		System.out.println("I am in " +year +" year");
		System.out.println("My grade is "+grade);
		System.out.println("=====================");
	}
	
	public void studentInfo(String name,String PRN,String course, int year,char grade) //non static method with parameters
	{
		System.out.println("===================");
		System.out.println("My name is "+name);
		System.out.println("My PRN is "+PRN);
		System.out.println("I am in "+course);
		System.out.println("I am in "+year +" year");
		System.out.println("My grade is "+grade);
		System.out.println("===================");
	}
	
	public void bioData(String name,float height,float age,String colour)
	{
		System.out.println("====================");
		System.out.println("My name is "+name);
		System.out.println("My height is "+height);
		System.out.println("My age is "+age +"years");
		System.out.println("My colour is "+colour);
		System.out.println("====================");
	}
}
