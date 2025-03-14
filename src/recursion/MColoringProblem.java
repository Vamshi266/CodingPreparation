package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MColoringProblem {
    public static boolean isSafe(int node, List<int[]> edges, int color[], int n, int col) {
	for (int[] edge : edges) {

	    // if( edge[0] == node && color[edge[1]] == col)
	    // this checks the whether teh node is current node and color of the adjacent
	    // node is not the current color
	    // same is true for other direction (we need to check this as this is undirected
	    // graph)

	    if (edge[0] == node && color[edge[1]] == col)
		return false;

	    if (edge[1] == node && color[edge[0]] == col)
		return false;
	}

	return true;
    }

    public static boolean util(int node, List<int[]> edges, int[] color, int n, int m) {
	if (node == n)
	    return true;

	// loop through colors
	for (int i = 1; i <= m; i++) {
	    // check if it's safe to to add color to current node
	    if (isSafe(node, edges, color, n, i)) {
		// add color
		color[node] = i;

		// call the recursion for next node
		if (util(node + 1, edges, color, n, m) == true)
		    return true;
		// as the recursive call fails it's not possible to have the color
		// so we backtrack and remove color
		color[node] = 0;
	    }
	}

	return false;
    }

    public static boolean optimal(int v, List<int[]> edges, int m) {

	int n = v;

	int color[] = new int[n];
	Arrays.fill(color, 0);

	if (util(0, edges, color, n, m) == true)
	    return true;

	return false;

    }

    public static void main(String[] args) {

	int[][] arr = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 }, { 0, 2 } };

	List<int[]> edges = new ArrayList<>();
	for (int temp[] : arr) {
	    edges.add(temp);
	}
	int m = 3;
	int v = 4;

	boolean res = optimal(v, edges, m);

	System.out.println("res = " + res);
    }
}
