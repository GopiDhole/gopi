package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Velocity");
		ll.add(123);
		ll.add('A');
		ll.add("Velocity");
		ll.add(null);
		ll.add(null);
		ll.add(12.12);
		ll.add(true);
	
		System.out.println(ll);
		System.out.println(ll.contains(123));
		System.out.println(ll.contains("Velocity"));
		System.out.println(ll.contains(null));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println(ll.equals("Velocity"));
		System.out.println(ll.equals(ll));
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf(null));
		System.out.println(ll.lastIndexOf(null));
		System.out.println(ll.lastIndexOf(12.12));
		System.out.println(ll.indexOf("Velocity"));
		System.out.println("========================");
		System.out.println(ll.peek());//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println("******************");
		System.out.println(ll.poll());//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(ll.pollFirst());	
		System.out.println(ll.pollLast());
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		System.out.println(ll.pop());//removes and returns the first element of this list.
		System.out.println(ll.remove());
		
		//for loop
		//for each
		//iterator
		//listIterator
		System.out.println("******************");
		System.out.println(ll);
		//for loop
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("======================");
		//Iterator
		Iterator It=ll.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}
		//ListIterator
		System.out.println("**********************");
		ListIterator ltr=ll.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		//for each
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		for(Object k:ll)
		{
			System.out.println(k);
		}

	}

}
