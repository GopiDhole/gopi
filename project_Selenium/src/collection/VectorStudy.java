package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Pune");
		v.add('A');
		v.add("Pune");
		v.add(null);
		v.add(null);
		v.add(12);
		v.add(1.2);
		v.add(87789);
		System.out.println(v);
		System.out.println(v.get(1));
		System.out.println(v.elementAt(1));
		System.out.println(v);
		System.out.println(v.remove(5));
		System.out.println(v);
		System.out.println(v.remove(1.2));//return boolean-->true or false
		System.out.println(v);
		System.out.println("============================");
		//for loop
		for(int i=0;i<=v.size()-1;i++)
		{
		System.out.println(v.get(i));	
		}
		System.out.println("====================");
		//Iterator
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***************************");
		//ListIterator
		ListIterator lit=v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		//for each
		for(Object q:v)
		{
			System.out.println(q);
		}
		System.out.println("..........................");
		Enumeration ve=v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
			
		

	}

}
