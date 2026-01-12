package com.csm.string;

public class MiddleNameReverse 
{
	public static void main(String[] args) 
	{
		String s="This is Good Boy";
		String rev="";
		String[] split = s.split(" ");
		if(split.length>3)
		{
			String firstWord =split[0];
			String sWord =split[1];
			String tWord =split[2];
			String fWord =split[3];

			for(int i=tWord.length()-1;i>=0;i--)
				{
					char c=tWord.charAt(i);
					rev+=c;
				}
			
			System.out.println(rev);
			System.out.println(firstWord+" "+sWord+" "+rev+" "+fWord);
		}
		
		
		
		
	}

}
