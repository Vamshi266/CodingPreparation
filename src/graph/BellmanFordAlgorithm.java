package graph;

import java.util.ArrayList;

public class BellmanFordAlgorithm {

	public static int[] bellmanFord(ArrayList<ArrayList<Integer>> al,int n,int s)
	{
		int[] dis = new int[n];
		for(int i=0;i<n;i++) dis[i] = (int)1e8;
		dis[s] = 0;
		
		//relaxing n-1 times
		
		//relax procedure
		//if(dis[u] + wt < dis[v])
		//	dis[v] = dis[u] + wt
		 
		for(int i=0;i<n;i++)
		{
			for(ArrayList<Integer>  it:al)
			{
				int u = it.get(0);
				int v = it.get(1);
				int wt = it.get(2);
				if(dis[u] != 1e8 && dis[u]+wt < dis[v])
				 dis[v] = dis[u] + wt;
			}
		}
		
		
		//detect negative cycle
		for(ArrayList<Integer> it:al)
		{
			int u = it.get(0);
			int v = it.get(1);
			int wt = it.get(3);
			if(dis[u] != 1e8 && dis[u] + wt < dis[v])
			{
				int temp[] = new int[0];
				temp[0] = -1;
				return temp;
			}
				
		}
		
		
		return dis;
	}
	
	
}
