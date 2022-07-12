package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.checkerframework.checker.units.qual.s;

public class ArrayListSpeInt {

	public static void main(String[] args) {
		ArrayList<Integer> ai=new ArrayList<>();
		ai.add(12);
		ai.add(15);
		ai.add(2);
		ai.add(6);
		ai.add(1);
		System.out.println(ai);
		System.out.println("=====================");
		//for loop
		for(int i=0;i<=ai.size()-1;i++)
		{
			System.out.println(ai.get(i));
		}
		System.out.println("===================");
		//Iterator
		Iterator it=ai.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================");
		//ListIterator
		ListIterator ltr=ai.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		//for each
		for(Integer s:ai)
		{
			System.out.println(s);
		}
		
			

	}

}
