package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Pair2
{
	int val;
	int src;
	
	public Pair2(int val,int src)
	{
		this.val = val;
		this.src = src;
	}
}


public class UnDirectedGraphBFSCycleDetection {

	
	//time complexity - O(V+2E)
	//space complexity - O(N)
	public boolean checkForCycle(int src,int v,ArrayList<ArrayList<Integer>> adjList,boolean[] vis)
	{
		vis[src] = true;
		Queue<Pair2> q = new LinkedList<>();
		q.add(new Pair2(src,-1));
		while(!q.isEmpty())
		{
			int node = q.peek().val;
			int parent = q.peek().src;
			
			q.remove();
			
			
			for(int adjNode:adjList.get(node))
			{
				if(vis[adjNode] == false)
				{
					vis[adjNode] = true;
					q.add(new Pair2(adjNode,node));
				}
				//if adjNode is the parent some and the node is mark visisted then
				//some other node has already traversed it .so in that case we can consider it as a cycle
				else if(parent != adjNode)
				{
					return true;
				}
				
			}
			
		}
		return false;	
	}
	
	
	
	public boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
	{
		boolean vis[] = new boolean[v];
		for(int i=0;i<v;i++)
			vis[i] = false;
		
		//checking for multiple components
		//even if one component in a graph has cycle we will return true
		for(int i=0;i<v;i++)
		{
			if(vis[i] == false)
			{
				if(checkForCycle(i, v, adj, vis)) return true;
			}
		}
		
		return false;
		
		
	}
	
	
	
	
	
}
