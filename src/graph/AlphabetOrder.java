package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//based on topological sort
public class AlphabetOrder {

	public static List<Integer> topoSort(int v,List<List<Integer>> adj)
	{
		int inDegree[] = new int[v];
		for(int i=0;i<v;i++)
		{
			for(int it:adj.get(i))
			{
				inDegree[i]++; 
			}
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<v;i++)
		{
			if(inDegree[i] == 0)
				q.add(i);
		}
		
		List<Integer> topo = new ArrayList<>();
		while(!q.isEmpty())
		{
			int node = q.peek();
			q.remove();
			topo.add(node);
			
			for(int it:adj.get(node))
			{
				inDegree[it]--;
				if(inDegree[it] == 0) q.add(it);
			}
		}
		
		return topo;
		
	}
	
	
	public static String findOrder(String[] dict,int n,int k)
	{
		List<List<Integer>> adj = new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			adj.add(new ArrayList<>());
		}
		
		for(int i=0;i<n-1;i++)
		{
			String s1 = dict[i];
			String s2 = dict[i+1];
			int len = Math.min(s1.length(), s2.length());
			for(int ptr=0;ptr<len;ptr++)
			{
				if(s1.charAt(ptr) != s2.charAt(ptr))
				{
					adj.get(s1.charAt(ptr) - 'a').get(s2.charAt(ptr)-'a');
					break;
				}
			}
		}
		
		List<Integer> topo = topoSort(k,adj);
		String ans= "";
		for(int it:topo)
		{
			ans += (char)(it + (int)('a'));
		}
		
		return ans;
			
	}
	
}
