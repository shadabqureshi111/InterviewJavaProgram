package com.csm.basic;

public class Num_Print_New_Line 
{
	public static void main(String[] args)
	{
		int num = 12345;

		int div = 10000;

		for (int i = div; i > 0; i = i / 10) 
		{
			int digit = num / i;
			System.out.println(digit);
			num = num % i;
			
		}
//		output :
//			1
//			2
//			3
//			4
//			5
			
	}
}
