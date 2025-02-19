package graph;

import java.util.Arrays;

public class AdjacensyMatrix {

	
	public static void main(String[] args) {
		
		//n - no of nodes
		//m - no of edges
		int n = 4;
		int m = 3;
		
		
		//adjMatrixacency matrix
		int[][] adjMatrix = new int[n+1][n+1];
		
		//fill the array with zeros initially
		for(int i=1;i<n;i++)
		{
			Arrays.fill(adjMatrix[i], 0);
		}
		
		
		//edges
		adjMatrix[2][1] = 1;
		adjMatrix[1][2] = 1;
		
		adjMatrix[2][3] = 1;
		adjMatrix[3][2] = 1;
		
		adjMatrix[3][1] = 1;
		adjMatrix[1][3] = 1;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(adjMatrix[i][j] == 1)
				{
					System.out.println(i+"--"+j);
				}
			}
		}
		
	}
	
}
