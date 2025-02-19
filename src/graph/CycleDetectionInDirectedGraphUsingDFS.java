package graph;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraphUsingDFS {

	
	public static boolean dfsCheck(int node,ArrayList<ArrayList<Integer>> adj
			,int vis[],int pathVis[])
	{
		vis[node] = 1;
		pathVis[node] = 1;
		
		for(int it:adj.get(node))
		{
			if(vis[it] == 0)
			{
				if(dfsCheck(it,adj,vis,pathVis) == false) return false;
			}
			else if(pathVis[it] == 1)
			{
				return true;
			}
		}
		
		
		pathVis[node] = 0;
		return false;
	}
	
	
	
	public static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int vis[] = new int[v];
		int pathVis[] = new int[v];
		
		for(int i=0;i<v;i++)
		{
			if(vis[i] == 0)
			{
				if(dfsCheck(i,adj,vis,pathVis) == true)
					return true;
			}
		}
		
		return false;
	}
	
}
