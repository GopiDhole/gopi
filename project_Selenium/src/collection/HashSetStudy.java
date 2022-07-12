package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//generic type hashSet
		hs.add("Pune");
		hs.add("Pune");
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains('A'));
		System.out.println(hs.equals(hs));
		System.out.println("===================");
		//for loop
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println();
//		}
		//iterator
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		//for each
		for(Object ab:hs)
		{
			System.out.println(ab);
		}
		
		//with string type
		System.out.println("###############");
		HashSet<String> has=new HashSet();
		has.add("Gopi");
		has.add("Paras");
		has.add("War");
		has.add("Sandhya");
		has.add("Gopal");
		
		System.out.println(has);
		System.out.println(has.contains("paras"));
		System.out.println(has.isEmpty());
		System.out.println(has.remove("War"));
		System.out.println(has);
		System.out.println(has.size());
		System.out.println("**************");
		//Iterator
		Iterator it1=has.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("...................");
		//for each
		for(Object b:has)
		{
			System.out.println(b);
		}
		System.out.println("@@@@@@@@@@@@");
		//with Char type
		HashSet<Character> hs2=new HashSet();
		hs2.add('X');
		hs2.add('Y');
		hs2.add('Z');
		hs2.add('W');
		hs2.add('V');
		System.out.println(hs2);
		System.out.println(hs2.size());
		System.out.println("--------------");
		//Iterator
		Iterator itr1=hs2.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("++++++++++++++++++");
		//for each
		for(Object c:hs2)
		{
			System.out.println(c);
		}
		System.out.println(">>>>>>>>>>>>>>>>");
		//Integer type
		HashSet<Integer> hs3=new HashSet();
		hs3.add(1);
		hs3.add(2);
		hs3.add(3);
		hs3.add(4);
		hs3.add(5);
		System.out.println(hs3);
		System.out.println("^^^^^^^^^^^^^^^");
		//iterator
		Iterator itr2 = hs3.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("------------------");
		//for each
		for(Object i:hs3)
		{
			System.out.println(i);
		}
	}

}
