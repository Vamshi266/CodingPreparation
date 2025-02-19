package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KhansAlgorithm {

	static int[] topSort(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int[] inDegree = new int[v];
		
		for(int i=0;i<v;i++)
		{
			for(int it:adj.get(i))
			{
				inDegree[it]++;
			}
		}
		
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<v;i++)
		{
			if(inDegree[i] == 0)
				q.add(i);
		}
		
		
		int topo[] = new int[v];
		int i=0;
		while(!q.isEmpty())
		{
			int node = q.peek();
			q.remove();
			
			topo[i++] = node;
			
			for(int it:adj.get(node))
			{
				inDegree[it]--;
				if(inDegree[it] == 0)
					q.add(it);
			} 
			
			
		}
		
		
		return topo;
		
		
	}
	
	
}
