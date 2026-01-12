package com.csm.basic;

public class FindMinWithSorting 
{
	public static void main(String[] args) 
	{
				int arr[]= {10,5,20,18,17,13};
				
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
					if(arr[i]<arr[j])
						{
							int temp=arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}
					}
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");			//Output : 20 18 17 13 10 5 
				}
				
				System.out.println("\n"+arr[arr.length-2]);	//Output : 10
				
		
		
	}

}
