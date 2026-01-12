package com.csm.string;

public class ToggleCase_SHAdab_shaDAB 
{
	 public static void main(String[] args)
	    {
	    	String s="shaDAB QureSHI";
	    			//SHAdab;
	    	
	    	StringBuffer sb = new StringBuffer();
	    	//char[] c = s.toCharArray();
	    	for(int i=0;i<s.length();i++)
	    	{
	    		if(Character.isUpperCase(s.charAt(i)))
	    		{
	    			sb.append(Character.toLowerCase(s.charAt(i)));
	    			
	    		}
	    		else if((Character.isLowerCase(s.charAt(i))))
	    		{
	    			sb.append(Character.toUpperCase(s.charAt(i)));
	    		}
	    		else
	    		{
	    			sb.append(s.charAt(i));
	    		}
	    	}
	    	
	    	//System.out.println(sb);
	    	System.out.println(sb.toString());
	    	
	    }

}
