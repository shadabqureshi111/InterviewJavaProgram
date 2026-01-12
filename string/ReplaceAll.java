package com.csm.string;

public class ReplaceAll 
{
	public static void main(String[] args) 
	{
		String s="Sha68d23ab Qu243res234hi345";
		String s1="S(&hadab Qure#@./shi";
		String s2="Shadab Qureshi";
		
		/* Remove All Number */
		System.out.println(s.replaceAll("\\d",""));			    //Output :Shadab Qureshi
		
		/* Remove All Special Character */
		System.out.println(s1.replaceAll("[^a-zA-Z ]",""));     //Output :Shadab Qureshi
		
		/* Remove All Character */
		System.out.println(s1.replaceAll("[a-zA-Z]",""));       //Output :(&#@./
		
		/* Remove All Vowel Character */
		System.out.println(s2.replaceAll("[aeiouAeiou]",""));   //Output :Shdb Qrsh
		
		/* Remove All Character and Showing only Vowel*/
		System.out.println(s2.replaceAll("[^aeiouAeiou]",""));  //Output :aauei
		
		/* Return True and False if they match*/
		System.out.println(s2.toLowerCase().matches(".*[aeiou]"));	//Output :true
		
		System.out.println(s2.toLowerCase().contains("a")||
				           s2.toLowerCase().contains("e")||
				           s2.toLowerCase().contains("i")||
				           s2.toLowerCase().contains("o")||			
				           s2.toLowerCase().contains("u"));			//Output :true
	
	}

}
