package backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
	
	
	//check whether we can move the respective(x,y) cell
	public static boolean isSafe(int x,int y,int[][] arr,int n,int[][] vis)
	{
		if((x >= 0 && x<n) && (y >= 0 && y < n) && (arr[x][y] == 1) && (vis[x][y] == 1))
			return true;
		else
			return false;
	}
	
	
	public static void solve(int x,int y,int[][] arr,int n,
			int[][] vis,List<String> res,StringBuilder path)
	{
		
		//if reached last cell(destination) add the string and return
		if(x == n-1 && y == n-1)
		{
			res.add(path.toString());
			return;
		}
		
		//mark visisted
		vis[x][y] = 1;
		
		
		//move in the direction that is viable and add that respective 
		//direction char to the string
		//when reached destination cell add that to List
		
		//down
		if(isSafe(x-1,y,arr,n,vis))
		{
			solve(x-1,y,arr,n,vis,res,path.append('D'));
			//remove the char when we backtrack from the direction chosen
			//remove last char
			path.deleteCharAt(path.length()-1);
		}
		
		
		//left
		if(isSafe(x,y-1,arr,n,vis))
		{
			solve(x,y-1,arr,n,vis,res,path.append('L'));
			path.deleteCharAt(path.length()-1);
		}
		
		//right
		if(isSafe(x,y+1,arr,n,vis))
		{
			solve(x,y+1,arr,n,vis,res,path.append('R'));
			path.deleteCharAt(path.length()-1);
		}
		
		//up
		if(isSafe(x-1,y,arr,n,vis))
		{
			solve(x-1,y,arr,n,vis,res,path.append('U'));
			path.deleteCharAt(path.length()-1);
		}
		
		vis[x][y] = 0;
	}
	
	public static List<String> searchMaze(int x,int y,int[][] arr,int n)
	{
		//path string
		StringBuilder path = new StringBuilder("");
		
		//result list
		List<String> res = new ArrayList<>();
		
		//visited array
		int[][] vis = new int[n][n];
		solve(x,y,arr,n,vis,res,path);
		return res;
		
	}
	
	public static void main(String[] args) {
		
	}

}
