package sampleClass;

import accessSpecifiers.Velocity;
public class AccessTest extends Velocity {

	public static void main(String[] args) {
	
		Velocity v=new Velocity();
		//v.test1(); //we cant call private members in another class
		//v.test2(); //calling default method-->visible within package
		//v.test3();//calling protected method-->visible only within package-->inheritance will provide out of package
		v.test4();//calling public method-->visible throughout project
		
		AccessTest at=new AccessTest();
		at.test3();
		at.test4();

	}

}
