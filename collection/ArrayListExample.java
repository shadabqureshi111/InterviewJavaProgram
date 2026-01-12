package com.csm.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(1);
		l.add(2);
		
		List<Integer> l1=new ArrayList<>();
		l1.add(5);
		l1.add(6);
		l1.add(4);
		l1.add(4);
		
		List<Integer> l2=new ArrayList<>();
		l2.addAll(l);
		l2.addAll(l1);
		
		ListIterator li=l2.listIterator();
		boolean fourValue=false;
		
		while(li.hasNext())
		{
			Object next = li.next();
			System.out.println(next);
			
			if(next.equals(4)&& !fourValue)
			{
				li.remove();
				fourValue=true;
			}
			
			else if(next.equals(4) && fourValue)
			{
				/* Isse sabhi index par 9 set hoga */
				
			//    int indexOf = l2.indexOf(4);
			//    l2.set(indexOf,9);
				
				
				/* Agar hume sirf first index par set karna ho to */
				
				int currentIndex = li.previousIndex();
				l2.set(currentIndex,9);
				break;
			}
			
			
		}
		
		System.out.println(l2);
		

}
	
}