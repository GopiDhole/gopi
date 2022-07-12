package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListSpeChar {

	public static void main(String[] args) {
		ArrayList<Character> ac=new ArrayList<>();
		ac.add('A');
		ac.add('B');
		ac.add('C');
		ac.add('D');
		ac.add('E');
		System.out.println(ac);
		System.out.println("=====================");
		//for loop
		for(int i=0;i<=ac.size()-1;i++)
		{
			System.out.println(ac.get(i));
		}
		System.out.println("=====================");
		//Iterator
		Iterator it=ac.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		//ListIterator
		ListIterator ltr=ac.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("=====================");
		//for each
		for(Character d:ac)
		{
			System.out.println(d);
		}
	}

}
