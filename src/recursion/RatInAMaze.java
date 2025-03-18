package recursion;

import java.util.ArrayList;

//here maze is a square matrix

//Time Complexity = (4^(N * N))
//Space Complexity = (N * N)
public class RatInAMaze {
    public static void util(int i, int j, ArrayList<ArrayList<Integer>> mat, int n, StringBuilder str,
	    ArrayList<String> res, boolean[][] vis) {

	// if reached destination add the path to res and return
	if (i == n - 1 && j == n - 1) {
	    res.add(str.toString());
	    return;
	}

	// down
	if ((i + 1 < n) && !(vis[i + 1][j]) && (mat.get(i + 1).get(j) == 1)) {
	    vis[i][j] = true;
	    str.append("D");
	    util(i + 1, j, mat, n, str, res, vis);
	    str.deleteCharAt(str.length() - 1);
	    vis[i][j] = false;
	}

	// left
	if ((j - 1 >= 0) && !(vis[i][j - 1]) && (mat.get(i).get(j - 1) == 1)) {
	    vis[i][j] = true;
	    str.append("L");
	    util(i, j - 1, mat, n, str, res, vis);
	    str.deleteCharAt(str.length() - 1);
	    vis[i][j] = false;
	}

	// right
	if ((j + 1 < n) && !(vis[i][j + 1]) && (mat.get(i).get(j + 1) == 1)) {
	    vis[i][j] = true;
	    str.append("R");
	    util(i, j + 1, mat, n, str, res, vis);
	    str.deleteCharAt(str.length() - 1);
	    vis[i][j] = false;
	}

	// up
	if ((i - 1 >= 0) && !(vis[i - 1][j]) && (mat.get(i - 1).get(j) == 1)) {
	    vis[i][j] = true;
	    str.append("U");
	    util(i - 1, j, mat, n, str, res, vis);
	    str.deleteCharAt(str.length() - 1);
	    vis[i][j] = false;
	}

	return;
    }

    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {

	ArrayList<String> res = new ArrayList<>();
	int n = mat.size();
	boolean[][] vis = new boolean[n][n];

	// Arrays.fill(vis,false);

	StringBuilder str = new StringBuilder();

	util(0, 0, mat, n, str, res, vis);

	return res;
    }

}
