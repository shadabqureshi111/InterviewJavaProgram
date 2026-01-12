package com.csm.basic;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1);
			int temp=num1+num2;
			num1=num2;
			num2=temp;
		}
		
	}

}
