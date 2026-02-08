package com.practice;

public class NumberPattern 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		int  n=5;
	
//1	
		
		
//	     1 
//	    2 2 
//	   3 3 3 
//	  4 4 4 4 
//	 5 5 5 5 5 

		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//2
		
//		 1 
//		 1 2 
//		 1 2 3 
//		 1 2 3 4 
//		 1 2 3 4 5 

		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
//3
		

//		 1 2 3 4 5 
//		 1 2 3 4 
//		 1 2 3 
//		 1 2 
//		 1 

		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//4
		
//		 1 
//		 2 3 
//		 4 5 6 
//		 7 8 9 10 
//		 11 12 13 14 15 

		 
		int num=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		System.out.println();
		
//5
		

//		 1 
//		 0 1 
//		 1 0 1 
//		 0 1 0 1 
//		 1 0 1 0 1 

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
				System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		
System.out.println();

//6


//1 
//2 1 2 
//3 2 1 2 3 
//4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 


		
		for(int i=1;i<=n;i++)
		{
			for(int l=i;l<n;l++)
			{
				System.out.print("  ");
			}
			
			for(int m=i;m>=1;m--)
			{
				System.out.print(m+" ");
			}
			
//			SecondHalf
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
//7
		
//		1 2 3 4 5 
//		2 3 4 5 
//		3 4 5 
//		4 5 
//		5 

		
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
System.out.println();

//8
		
//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
//4 5 
//5 
//4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5 


		for(int i=1;i<=n;i++)
		{
			for(int k=i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int m=n-1;m>=1;m--)
		{
			for(int l=1;l<m;l++)
			{
				System.out.print(" ");
			}
			
			for(int a=m;a<=n;a++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println();

//9
		
//		    1 
//		   1 1 
//		  1 2 1 
//		 1 3 3 1 
//		1 4 6 4 1
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}
		
		

		
		

	}


}
