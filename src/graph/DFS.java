package graph;

import java.util.ArrayList;

public class DFS {
	
	
	//space complexity = O(n) 
	//time complexity = O(n) + (2*E)
	public static ArrayList<Integer> dfsTraversal(ArrayList<ArrayList<Integer>> graph,int v)
	{
		//visited array
		boolean vis[] = new boolean[v];
	
		//mark start vertex as visited
		vis[0] = true;
		
		//resultant list
		ArrayList<Integer> al = new ArrayList<>();
		dfs(0,vis,graph,al);
		return al;
		
	}
	
	public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> graph,ArrayList<Integer> al)
	{
		//mark the node as visited
		vis[node] = true;
		
		//add it to the resultant list
		al.add(node);
		
		//travel depth wise for the nodes in order;
		//if the node has no neighbor the recursion call will
		//come back to previous node and start to travel for other unvisited vertices
		for(int it:graph.get(node))
		{
			if(vis[it] == false)
				dfs(it,vis,graph,al);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		int v = 5;
		for(int i=0;i<v;i++)
		{
			al.add(new ArrayList<>());
		}
		 al.get(0).add(1);
		 al.get(1).add(0);
		 al.get(0).add(4);
		 al.get(4).add(0);
		 al.get(1).add(2);
		 al.get(1).add(2);
		 al.get(1).add(3);
		 al.get(3).add(1);
		 
		 ArrayList<Integer> res = dfsTraversal(al,v);
		System.out.println("DFS traversal");
		 for(int i:res)
		 {
			 System.out.print(i+" ");
		 }
	}
	
	
}
