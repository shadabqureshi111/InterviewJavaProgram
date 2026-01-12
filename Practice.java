package com.csm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class User implements Comparable<User>
{
	public int id;
	public String name;
	public double marks;

	public User(int id, String name, double marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return "id=" + id + ", name=" + name + ", marks=" + marks + "]\n";
	}

	
	@Override
	public int compareTo(User o) 
	{
		return this.name.compareTo(o.name);
//		return Integer.compare(this.id,o.id);
	}
}

class ComparatorE implements Comparator<User>
{
	@Override
	public int compare(User o1, User o2) 
	{
		return Integer.compare(o1.id,o2.id);
	}
	
}


public class Practice 
	{
	
		public static void main(String[] args)
		{
		User user1 = new User(2,"Shadab", 87);
		User user2 = new User(3,"Ayan", 97);
		User user3 = new User(1,"Ayan", 57);
		
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		System.out.println("Before = \n" + list);
		
		System.out.println("\n\n");
		Collections.sort(list);
		System.out.println("After Comparable \n = "+list);
		
		
		System.out.println("\n\n");
		ComparatorE comparatorE = new ComparatorE();
		Collections.sort(list,Comparator.comparing((User u)->u.name).thenComparingDouble(u->u.marks));
		System.out.println("After Comparator \n = "+list);
		
		}
		
	}
