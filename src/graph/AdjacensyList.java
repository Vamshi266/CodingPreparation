package graph;

import java.util.ArrayList;

public class AdjacensyList {

	public static void main(String[] args) {

		// n - no of vertices
		// m - no of edges
		int n = 4;
		int m = 3;

		// Adjacency List
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			adjList.add(new ArrayList<>());
		}

		// edges
		adjList.get(1).add(2);
		adjList.get(2).add(1);

		adjList.get(2).add(3);
		adjList.get(3).add(2);

		adjList.get(1).add(3);
		adjList.get(3).add(1);
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<adjList.get(i).size();j++)
			{
				System.out.print(adjList.get(i).get(j));
			}
			System.out.println();
		}
	}

}
