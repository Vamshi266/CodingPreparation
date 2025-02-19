package graph;

import java.util.ArrayList;



public class UnDirectedGraphDFSCycleDetection {

	//time complexity - O(V+2E)
	//space complexity - O(N)
	//v - vertices,E - edges , 2E - degree for a undirected graph
	public static boolean dfs(int node,int parent,ArrayList<ArrayList<Integer>> adjList,int vis[])
	{
		vis[node] = 1;
		for(int adjNode:adjList.get(node))
		{
			if(vis[adjNode] == 0)
				if(dfs(adjNode,node,adjList,vis) == true)
					return true;
			else if(adjNode != parent)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	//multiple components code
	public static boolean  isCycle(int v,ArrayList<ArrayList<Integer>> al)
	{
		int vis[] = new int[v];
		for(int i=0;i<v;i++)
		{
			if(vis[i] == 0)
				if(dfs(i,-1,al,vis) == true) return true;
		}
		return false;
	}
	
}
