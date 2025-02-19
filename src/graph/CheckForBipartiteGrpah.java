package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckForBipartiteGrpah {

	
	
	
	public static boolean check(int start,int v,ArrayList<ArrayList<Integer>> adj,int color[])
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		while(!q.isEmpty())
		{
			int node = q.peek();
			q.remove();
			
			for(int it:adj.get(node))
			{
				if(color[it] == -1)
				{
					color[it] = 1 - color[node];
					q.add(it);
				}
				else if(color[it] == color[node])
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	
	public static boolean isBipartite(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int[] color = new int[v];
		
		
		for(int i=0;i<v;i++)
		{
			color[i] = -1;
		}
		
		
		for(int i=0;i<v;i++)
		{
			if(color[i] == -1)
			{
				if(check(i, v, adj, color) == false)
				{
					return false;
				}
			}
		}
		
		
		return true;
	}
	
}
