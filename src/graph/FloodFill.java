package graph;

public class FloodFill {

	
	
	public static void dfs(int row,int col,int[][] image,int ans[][]
			,int newColor,int initColor,int delrow[],int delcol[])
	{
		ans[row][col] = newColor;
		int n = image.length;
		int m = image[0].length;
		
		for(int i=0;i<4;i++)
		{
			int nrow = row + delrow[i];
			int ncol = col + delcol[i];
			
			if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
					&& image[nrow][ncol] == initColor && ans[nrow][ncol] != newColor)
			{
				dfs(nrow,ncol,image,ans,newColor,initColor,delrow,delcol);
			}
		}
	}
	
	
	public static int[][] floodFill(int[][] image,int sr,int sc,int newColor)
	{
	
		int initColor = image[sr][sc];
		int ans[][] = image;
		int delrow[] = {-1,0,+1,0};
		int delcol[] = {0,+1,0,-1};
		dfs(sr,sc,image,ans,newColor,initColor,delrow,delcol);
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[][] image = {
				{1,1,1},
				{1,1,0},
				{1,0,1}
		};
		
		
		int[][] res = floodFill(image,1,1,2);
		
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
