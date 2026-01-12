package com.csm.basic;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 152;

		int arm=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			arm+=rem*rem*rem;
		}

		System.out.println(arm);
	}

}
