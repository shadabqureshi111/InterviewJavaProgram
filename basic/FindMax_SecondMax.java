package com.csm.basic;

public class FindMax_SecondMax 
{
	public static void main(String [] args)
	{
		int arr[]= {9,6,2,5,-3,7,3,1,4,10,-2};
    	int max=arr[0];
    	int secondMax=Integer.MIN_VALUE;
    	for(int i=1;i<arr.length;i++)
    	{
    		if(arr[i]>max)
    		{
    			secondMax=max;
    			max=arr[i];
    		}
    		else if(arr[i]>secondMax && arr[i]!=max)
    		{
    			secondMax=arr[i];
    		}
    	}
    	System.out.println(max+"  "+secondMax);
		}
}
