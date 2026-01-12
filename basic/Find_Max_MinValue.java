package com.csm.basic;

public class Find_Max_MinValue 
{
	public static void main(String [] args)
	{
		int arr[]= {1,9,8,2,6,4};
		int max=arr[0];
		int maxIndex=0;
		int min=arr[0];
		int minIndex=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxIndex=i;
			}
			if(arr[i]>max && arr[i]!=max)
			{
				min=arr[i];
				minIndex=i;
			}
			
		}
		
		System.out.println("max  ="+max+"         Min =  "+min +"      Diffrence = "+(max-min));
	System.out.println(maxIndex+"   "+minIndex);
		}

}
