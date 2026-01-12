package com.csm.string;

public class StringFunction 
{
	public static void main(String[] args) 
	{
		String name="  Shadab Qureshi";
		String s="Shadab Qureshi";
		System.out.println(s);						//Output :Shadab Qureshi
		
		System.out.println(name.trim());  			//Output :Shadab Qureshi(Remove Space)
		
		System.out.println(s.replace("a","d"));  	//Output :Shdddb Qureshi
		
		System.out.println(s.contains("v"));	 	//Output :false
		
		System.out.println(s.endsWith("b"));		//Output :false	 
		
		System.out.println(s.replace("S","s").startsWith("S"));//Output :false 
		
		System.out.println(s.contentEquals("Shadab Qureshi"));	//Output :true
		
		
		
	}

}
