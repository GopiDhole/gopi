package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		//ArrayList Generic
		ArrayList a=new ArrayList();
		a.add("Velocity");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(123.123);
		a.add("Velocity");
		a.add(null);
		a.add(123);
		a.add(null);
		System.out.println(a);//print array list
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.get(1));// pass index to see element
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Velocity"));
		System.out.println(a.lastIndexOf("Velocity"));
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println("=====================");
		//for loop
		for(int i=0;i<=a.size()-1;i++)
		{
		System.out.println(a.get(i));	
		}
		System.out.println("=====================");
		//Iterator
		Iterator it = a.iterator();
		while (it.hasNext());
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		//listIterator
		ListIterator ltr = a.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("=====================");
		//for each
		for(Object v:a)//first take a , then :, then take v as a variable which travels from elements, then take its local variable
		{
			System.out.println(v);
		}
		
		//ArrayList Specified -->ArrayList<interger>
		ArrayList<Integer> ai=new ArrayList<>();
		ai.add(12);
		ai.add(10);
		ai.add(20);
		ai.add(2);
		ai.add(50);
		System.out.println(ai);
		
		//for loop
		
		
	}

}
