package com.practice;

public class StarPattern {
	public static void main(String[] args) 
	{
		int n=5;

//1
//			   * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
//2
		
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
		
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
//3
		

//						        * 
//          * * 
//      			 * * * 
//       * * * * 
//  			 * * * * * 
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
//4
		
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
//5
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 

		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
//6
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
	
		
//7
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
//8
//		* * * * * 
//		  * * * * * 
//		   * * * * * 
//		    * * * * * 
//		     * * * * * 
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
//9
		
		
//		  	  * * * * * 
//		   * * * * * 
//		  * * * * * 
//		 * * * * * 
//		* * * * * 
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
//10
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int k=2;k<=n;k++)
		{
			for(int l=k;l>=1;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
//11
		
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 

		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
				{
					System.out.print("* ");
				}
				else {
                    System.out.print("  ");
                }
			}
			System.out.println();
		}
		System.out.println();
		
//12

//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n);j++)
			{
				if(j>i && j<=(2*n-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=(2*n);j++)
			{
				if(j>i && j<=(2*n-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
//13
//		   	* 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 

		
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
//14
//		*         * 
//		* *       * * 
//		* * *     * * * 
//		* * * *   * * * * 
//		* * * * * * * * * * 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n);j++)
			{
				if(j>i && j<=(2*n-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
//15

		
		
//		
//	   	*
//	   * *
//	  *   *
//	 *     *
//	*********
	for(int i=1;i<=n;i++)
	{
		for(int k=i;k<n;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(2*i-1);j++)
		{
			if(j==1||j==(2*i-1)||i==n )
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
	System.out.println();
		
//16
	
//	*********
//	 *     *
//	  *   *
//	   * *
//	    *
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1)||i==n)
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
		System.out.println();

//17
		
//		  	  *
//		   * *
//		  *   *
//		 *     *
//		*       *
//		 *     *
//		  *   *
//		   * *
//		    *
		
		//FirstHalf
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||j==(2*i-1))
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
		
			//SecondHalf
		for(int i=n-1;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||j==(2*i-1))
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
		
//18
		
//		*********
//		 *     *
//		  *   *
//		   * *
//		    *
//		   * *
//		  *   *
//		 *     *
//		*********
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1)||i==n)
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
		
		for(int i=2;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1)||i==n)
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
}
