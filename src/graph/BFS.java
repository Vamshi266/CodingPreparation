package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	//space complexity = O(n)
	//time complexity = O(n)+O(2*E);
	public static ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> graph,int v)
	{
		//answer arrayList
		ArrayList<Integer> bfslist = new ArrayList<>();
		
		//visited array
		boolean vis[] = new boolean[v];
		
		//queue
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(0);
		vis[0] = true;
		
		
		//Get all neighbor vertices of dequeued node
		//if the neighbors are visited mark them as true in visited array
		//enqueue it on to the queue if not visited
		while(!queue.isEmpty())
		{
			Integer node = queue.poll();
			bfslist.add(node);
			
			
			for(int tt:graph.get(node))
			{
				if(vis[tt] == false)
				{
					vis[tt] = true;
				    queue.add(tt);
				}
			}
		}
		
		
		return bfslist;
	}

	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
		int n = 5;
		for(int i=0;i<n;i++)
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
		
		 
		 
		ArrayList<Integer> ans = bfsTraversal(al,5);
		
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
		
	}
	
}





