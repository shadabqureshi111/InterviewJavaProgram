package com.csm;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String s="Shadab";
		String rev="";
		char[] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=c[i];
		}
		System.out.println(rev);
		
	}

}
