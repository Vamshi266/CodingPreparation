package matrix;

import java.util.Arrays;

public class Multiplication {
	
	
	
	
	static int[][] multiply(int a[][],int b[][])
	{
		//m x n
		//p x q 
		//n == p
		//product matrix will be of size m x q 
		int m = a.length;
		int n = a[0].length;
		
		int p = b.length;
		int q = b[0].length;
		
		int c[][] = new int[m][q];
		
		if(n != p)
		{
			System.out.println("matrix product not possible");
			return c;
		}
		
		
		
		Arrays.fill(c,0);
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				for(int k=0;k<n;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return c;
		
	}

}
