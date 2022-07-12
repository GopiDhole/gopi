package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetStudy {
	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("Pune");
		ls.add("Pune");
		ls.add('A');
		ls.add(12.24);
		ls.add(15);
		ls.add(null);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);
		//for loop
//		for(int i=0;i<=ls.size()-1;i++)
//		{
//			System.out.println());
//		}
		System.out.println("===================");
		//iterator
		Iterator it1=ls.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("...............");
		for(Object t1:ls)
		{
			System.out.println(t1);
		}
		System.out.println("***************");
		//Integer
		LinkedHashSet<Integer> ls2=new LinkedHashSet();
		ls2.add(1);
		ls2.add(2);
		ls2.add(3);
		ls2.add(4);
		ls2.add(5);
		ls2.add(6);
		System.out.println(ls2);
		//iterator
		Iterator it2=ls2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println("$$$$$$$$$$$$$$$");
		//for each
		for(Integer t2:ls2)
		{
			System.out.println(t2);
		}
		
		
		
	}
}
