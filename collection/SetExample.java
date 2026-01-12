package com.csm.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) throws InterruptedException 
	{
		Set<Integer> l=new HashSet<>();
		l.add(3);
		l.add(1);
		l.add(2);
		
		Set<Integer> l1=new HashSet<>();
		l1.add(5);
		l1.add(6);
		l1.add(4);
		l1.add(4);
		
		Set<Integer> l2=new HashSet<>();
		l2.addAll(l);
		l2.addAll(l1);
		
		System.out.println(l2);
		
		Iterator li=l2.iterator();
		while(li.hasNext())
		{
			Object next = li.next();
			System.out.println(next);
			
			if(next.equals(6))
			{
				li.remove();
			}
		}
		
		System.out.println(l2);

		
		
		
	 
	}

}
