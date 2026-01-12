package com.csm.pattern;

public class Holo_Rectangle 
{
	public void Data()
	{
		System.out.println("\n*****First Method*****\n");
		int arr[]= {1, 2, 3, 4};
//		int arr1[]=new int[]{arr.length};
		int count=0;
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum= sum+arr[i];
//			arr1[count]=n;
		}
//		count++;
		
		System.out.println(sum);
//		for(int j=0;j<count;j++)
//		{
//			System.out.println(arr1[j]);
//		}
		
	}
	
public void sumOfEachArray_ThanFindMax()
	{
	System.out.println("\n*****Second Method*****\n");
		int arr[][]= {{2,8,7},{7,1,3},{1,9,5}};
		int arr1[]=new int[arr.length];
		int count=0;
		int max=0;
	
		for(int i=0;i<=arr.length-1;i++)
			{
				int sum=0;
				for(int j=0;j<arr[i].length;j++)
					{
						sum=sum+arr[i][j];
						arr1[count]=sum;
					}
					count++;
			}
		for(int i=0;i<arr1.length;i++)
			{
				System.out.print("{"+arr1[i]+"}");
			}
	
		for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]>max)
					{
					max=arr1[i];
					}
		
			}
		System.out.println();
		System.out.println("Max = "+max);
	}
	

public void hollow_tringle()
{
	System.out.println("\n*****Third Method*****\n");
		
	int num=5;
        
        for(int i=1;i<=num;i++)
        	{
        		for(int k=i;k<num;k++)
        			{
        			System.out.print(" ");
        			}
        		for(int j=1;j<=(2*i-1);j++)
        			{
        			if(j==1||j==(2*i-1)|| i==num)
        				{
        				System.out.print("*");
        				}
        			else
        				{
        				System.out.print(" ");
        				}
            }
            System.out.println();
        }
       
}		
	
	
	public static void main(String[] args)
	{

		Holo_Rectangle p =new Holo_Rectangle();
		p.Data();
		p.sumOfEachArray_ThanFindMax();
		p.hollow_tringle();
	
	
		
	}

}
