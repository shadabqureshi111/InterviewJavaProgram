package com.csm.basic;

public class PrintDuplicateDigitNumber 
{
	public static void main(String[] args) 
	{
		int fn=100;
		int ln=150;
		for(int i=fn;i<=ln;i++)
		{
			int hundred=i/100;
			int ten=(i/10)%10;
			int unit=i%10;
			
			if(hundred ==ten ||hundred==unit||ten==unit)
			{
				System.out.println(i);
			}
		}
		
	}

}
