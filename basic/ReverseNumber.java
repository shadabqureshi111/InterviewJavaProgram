package com.csm.basic;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println(rev);  							//Output : 321
		
	}

}
