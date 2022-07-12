package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(90);
		t.add(20);
		t.add(10);
		t.add(12);
		
		System.out.println(t);
		System.out.println("============");
		//iterator
		Iterator it1=t.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("************");
	
		//for each
		for(Object a1:t)
		{
			System.out.println(a1);
		}
		

	}

}
