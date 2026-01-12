package com.csm.string;

public class DuplicateCharacterRemove 
{

	public static void main(String[] args) 
	{
		String s="Heelllllo gggooooddd mmmmoorrrrnnniinnng";
		String s1="";
		char ch='\0';
		
		for(char c:s.toCharArray())
		{
			if(c!=ch)
			{
				s1+=c;
				ch=c;
			}
		}
	
		
		
		
		System.out.println(s1);
		
		
    }

}
