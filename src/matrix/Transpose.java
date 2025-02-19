package matrix;

public class Transpose {
	
	
	static void printMatrix(int arr[][])
	{
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void transpose(int arr[][])
	{
		
		int n = arr.length;
		
		int tempArr[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				tempArr[j][i] = arr[i][j];
			}
		}
		
		return;
	}

}
