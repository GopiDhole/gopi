package inheritanceStudy;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		//calling mothers property using mothers object
		Mother m=new Mother(); //created object for non static method in mother class
		m.nature(); //calling mothers property using mothers object-->calling non static regular method nature from class mother
		m.love(); //calling mothers property using mothers object-->calling non static regular method love from class mother
		Mother.look(); // calling mothers property using mothers class name -->calling static regular method look from class mother
		
		//calling son's property using son's object
		Son s=new Son();//created object for non static method in son class
		s.mobile(); //calling sons property using sons object-->calling non static regular method from class Son
		s.laptop(); //calling sons property using sons object-->calling non static regular method from Class son
		Son.bike();// calling sons property using sons class name-->calling static regular method from class son
		
		s.nature(); // calling mothers property using sons object-->calling non static regular method  nature from sons class
		s.love(); //calling mothers property using sons object--> calling non static regular method love from sons class
		Son.look();//calling mothers property using sons class name-->calling static regular method look from from sons classname
		
		
	}

}
