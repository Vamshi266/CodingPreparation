package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {


	public static int orangeRotting(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		
		
		//visited array
		int[][] vis = new int[n][m];
		
		//queue
		Queue<Pair1> q = new LinkedList<>();
		
		int cnt = 0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(grid[i][j] == 2)
				{
					q.add(new Pair1(i,j,0));
					vis[i][j] = 2;
				}
				else
				{
					vis[i][j] = 0;
				}
				
				if(grid[i][j] == 1)
					cnt++;
				
			}
		}
		
		int drow[] = {-1,0,1,0};
		int dcol[] = {0,1,0,-1};
		int cntFresh = 0;
		int tm = 0;
		
		while(!q.isEmpty())
		{
			int r = q.peek().row;
			int c = q.peek().col;
			int t = q.peek().tm;
			q.remove();
			tm = Math.max(tm, t);
			
			for(int i=0;i<4;i++)
			{
				int nrow = r + drow[i];
				int ncol = c + dcol[i];
				
				if(nrow >= 0 && nrow < n && ncol >= 0 
						&& ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
				{
					
					q.add(new Pair1(nrow,ncol,t+1));
					vis[nrow][ncol] = 2;
					cntFresh++;
				}
				
				
			}
	
		}
		
		if(cnt != cntFresh)
			return -1;
		
		
		return tm;
		
	}
	
	
public static void main(String[] args) {
		
		
		int[][] grid =  {{0,1,2},{0,1,2},{2,1,1}};
		
		int  ans = orangeRotting(grid);
		
		System.out.println("the minimum time required for orange rottening  = "+ans);
		
	}
}

class Pair1
{
	int row;
	int col;
	int tm;
	public Pair1(int row, int col, int tm) {
		super();
		this.row = row;
		this.col = col;
		this.tm = tm;
	}
	
	
}


