package graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int first;
	int second;
	
	public Pair(int first,int second)
	{
		this.first = first;
		this.second = second;
	}
}



public class NoOfIslands {

	
	
	
	public static void bfs(int[][] vis,char[][] grid,int row,int col)
	{
		vis[row][col] = 1;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(row,col));
		int n = grid.length;
		int m = grid[0].length;
		
		
		while(!q.isEmpty())
		{
			int rows = q.peek().first;
			int cols = q.peek().second;
			q.remove();
			
			for(int delrow=-1;delrow <= 1;delrow++)
			{
				for(int delcol=-1;delcol <= 1;delcol++)
				{
					int nrow = rows+delrow;
					int ncol = cols+delcol;
					
					if(nrow >= 0 && nrow < n && ncol >= 0 
							&& ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0)
	
					{
						vis[nrow][ncol] = 1;
						q.add(new Pair(nrow,ncol));
					}
				}
			}
			
		}
		
		
		
	}
	
	
	
	
	
	public static int noOfIslands(char[][] grid)
	{
		
		int n = grid.length;
		int m = grid[0].length;
		
		
		int[][] vis = new int[n][m];
		int cnt = 0;
		
		for(int row = 0;row < n;row++)
		{
			for(int col = 0;col < m;col++)
			{
				if((vis[row][col] == 0) && (grid[row][col] == '1'))
				{
					cnt++;
					bfs(vis,grid,row,col);
				}
			}
		}
		
		
		return cnt;
		
	}
	
	
	public static void main(String[] args) {
		
		char[][] grid = {{'0', '1', '1', '1', '0', '0', '0'},
	            {'0', '0', '1', '1', '0', '1', '0'}};
		
		int ans = noOfIslands(grid);
		
		System.out.print("no of islands = "+ans);
		
	}
	
}
