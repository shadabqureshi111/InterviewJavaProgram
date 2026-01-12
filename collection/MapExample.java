package com.csm.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 


public class MapExample {
	public static void main(String[] args) throws InterruptedException 
	{
		
		Map<Integer,Integer> l=new HashMap<>();
		l.put(2,3);
		l.put(3,1);
		l.put(1,2);
		
		Map<Integer,Integer> l1=new HashMap<>();
		l1.put(5,6);
		l1.put(6,4);
		l1.put(4,5);

		Map<Integer,Integer> l2=new HashMap<>();
		l2.putAll(l);
		l2.putAll(l1);
		
		System.out.println(l2);
		
//		Set<Entry<Integer,Integer>> entry=l2.entrySet();
		for(Entry<Integer,Integer> i:l2.entrySet())
		{
			Integer key = i.getKey();
			Integer value = i.getValue();
			
			
			System.out.println(key+":"+value);
		}
		
		System.out.println(l2);

		
		Set<Integer> keySet = l2.keySet();
		
		for(Integer key:keySet)
		{
			Integer value = l2.get(key);
			
			System.out.println(key+":"+value);
			
		}
		
	 
	 
	}
		 
	
}
