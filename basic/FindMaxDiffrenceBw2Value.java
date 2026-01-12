package com.csm.basic;

public class FindMaxDiffrenceBw2Value {
public static void main(String[] args) 
{
	int arr[]= {2,5,6,8,4};
	int sp=0,lp=0;
	int large=arr[0];
	int small=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
			sp=i;
		}
		if(arr[i]>large)
		{
			large=arr[i];
			lp=i;
		}
	}
	
	System.out.println(small+" "+large);
	System.out.println("position = "+sp+" "+lp);
	System.out.println("Diffrence = "+ (large-small));
}
}
