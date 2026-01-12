package com.csm.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample 
{
		public static void main(String[] args) 
		{
			List<String> l1 = new LinkedList<>();
			l1.add("B");
			l1.add("A");
			l1.add("B");
			l1.add("C");
			l1.add(null);
			l1.add(null);
			
			List<String> l2 = new LinkedList<>();
			l2.add("D");
			l2.add("E");
			l2.add("F");
			
	/* First Method to Add Object */
			List<String> l3 = new LinkedList<>();
//			l3.addAll(l1);
//			l3.addAll(l2);
			
			/* Second Method to Add Object */
			for(String s:l1)
			{
				l3.add(s);
			}
			for(String s1:l2)
			{
				l3.add(s1);
			}
			
	/* By Using Iterator  */
			Iterator i=l3.iterator();
			while(i.hasNext())
			{
				String next = (String) i.next();
				if(next==null)
				{
					i.remove();
				}
			}
			
			System.out.println(l3);
			/* By Using ListIterator  */
			ListIterator li=l3.listIterator();
			while(li.hasNext())
			{
				String next = (String) li.next();
				if(next.equals("a"))
				{
					int indexOf = l1.indexOf(next);
					System.out.println(indexOf);
					l3.set(indexOf, "z");
				}
			}
			System.out.println(l3);
		}

	


}
