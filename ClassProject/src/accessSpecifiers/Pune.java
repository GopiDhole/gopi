package accessSpecifiers;

public class Pune {

	public static void main(String[] args) {
		Velocity v=new Velocity();
		//v.test1();we cant call private method in another class
		v.test2();//calling default method -->visible within package
		v.test3();//calling protected method-->visible within package-->inheritance will provide 
		v.test4();
	}

}
