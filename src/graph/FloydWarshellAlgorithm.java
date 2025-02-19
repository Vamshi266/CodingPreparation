package graph;

public class FloydWarshellAlgorithm {

	
	public static void multiSourceShortestPath(int[][] arr)
	{
		
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j] == -1)
					arr[i][j] = (int)1e9;
				if(i == j)
					arr[i][j] = 0;
			}
		}
		
		for(int k=0;k<n;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j] = Math.max(arr[i][j], (arr[i][k] + arr[k][j]));
				}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j] == (int)1e9)
					arr[i][j]= -1;
			}
		}
		
		return;
	}
	
	
	
}
