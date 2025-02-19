package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInDirectedGraph {

	public static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
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
		

		int cnt = 0;
		while(!q.isEmpty())
		{
			int node = q.peek();
			q.remove();
			cnt++;
			
			for(int it:adj.get(node))
			{
				inDegree[it]--;
				if(inDegree[it] == 0)
					q.add(it);
			} 
			
			
		}
		
		
		
		//if the linear ordering is not present
		//there exists a cycle
		//that means is linear ordering size is equal to n then there is no cycle
		//else there exists a cycle which means there exists a cycle
		if(cnt == v)
			return false;
		else
			return true;
		

	}
	
	
}
