package graph;

import java.util.LinkedList;
import java.util.Queue;

class Node4
{
	int first;
	int second;
	int third;
	public Node4(int first, int second, int third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}	
}






public class DistanceOfNearestCellHaving1 {
	
	public static int[][] nearest(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		int vis[][] = new int[n][m];
		int dist[][] = new int[n][m];
		Queue<Node4> q = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(grid[i][j] == 1)
				{
					q.add(new Node4(i,j,0));
					vis[i][j] = 1;
				}
				else
				{
					vis[i][j] = 0;
				}
			}
		}
		
		int delRow[] = {-1,0,1,0};
		int delCol[] = {0,1,0,-1};
		
		
		while(!q.isEmpty())
		{
			int row = q.peek().first;
			int col = q.peek().second;
			int steps = q.peek().third;
			q.remove();
			dist[row][col] = steps;
			
			for(int i=0;i<4;i++)
			{
				int nrow = row + delRow[i];
				int ncol = col + delCol[i];
				
				if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && vis[nrow][ncol] == 0)
				{
					vis[nrow][ncol] = 1;
					q.add(new Node4(nrow,ncol,steps+1));
				}
			}
			
		}
		
		return dist;
		
	}
	

	public static void main(String[] args) {
		
		int grid[][] = {{1,0,1},{1,1,0},{1,0,0}};
		
		int ans[][] = nearest(grid);
		
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
