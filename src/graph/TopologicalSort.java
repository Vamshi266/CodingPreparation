package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

	
	
	public static void dfs(int node,int vis[],Stack<Integer> st,ArrayList<ArrayList<Integer>> al)
	{
		vis[node] = 1;

		for(int it:al.get(node))
		{
			if(vis[node] == 0)
				dfs(it,vis,st,al);
			
			st.push(it);
		}
	}
	
	
	public static int[] topSort(int v,ArrayList<ArrayList<Integer>> al)
	{
		int vis[] = new int[v];
		
		
		Stack<Integer> s = new Stack<>();
		//for multiple components
		for(int i=0;i<v;i++)
		{
			if(vis[i] == 0)
				dfs(i,vis,s,al);
		}
		
		int[] ans = new int[v];
		int i=0;
		while(!s.isEmpty())
		{
			ans[i++] = s.peek();
			s.pop();
		}
		
		return ans;
		
		
	}
	
	
}
