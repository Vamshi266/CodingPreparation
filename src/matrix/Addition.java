package matrix;

public class Addition {

	public static int[][] addMatrx(int[][] A,int[][] B)
	{
		
		int[][] ans = A;
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				ans[i][j] = A[i][j] + B[i][j]; 
			}
		}
		
		
		return ans;
		
	}
	
}
