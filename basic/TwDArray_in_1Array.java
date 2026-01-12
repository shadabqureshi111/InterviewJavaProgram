package com.csm.basic;

public class TwDArray_in_1Array 
{
	public static void main(String[] args) 
	{
		int num[][] = { {1,2,3},
						{6,7,8},
						{1,2,3}
					   };

		int row=num.length;
		int col=num[0].length;
		
		int n[]= new int[row*col];
		int index=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++ )
			{
				n[index] = num[i][j];
				//n[index] = num[i][j];  // Corrected the index access
				index++;
			}
			
		}
		System.out.print("[");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
			System.out.print(",");
		}
		System.out.print("]");

	

	
	
	//By Using only 1 Array
	
	
//		
//		int num[][] = { {1,2,3},
//				{6,7,8},
//				{1,2,3}
//			   };
//
//int row=num.length;
//int col=num[0].length;
//System.out.println("col = "+col);
//int n[]= new int[row*col];
//int index=0;
//for(int i=0;i<row*col;i++)
//{
//	 int r = i / col; 
//	 
//	System.out.println(i+"/"+col+" = "+i/col);
//    int c = i % col; 
//    System.out.println(i+"%"+col+" = "+i%col);
//    n[index++] = num[r][c];
//    System.out.println();
//	
//	
//}
//System.out.print("[");
//for(int i=0;i<n.length;i++)
//{
//	System.out.print(n[i]);
//	System.out.print(",");
//}
//System.out.print("]");
//
//	}
//	
//	
//	
	}}
