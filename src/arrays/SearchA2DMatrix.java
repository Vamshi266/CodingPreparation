package arrays;

import java.util.ArrayList;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

	// if(matrix[0].length == 1 && matrix.length == 1)
	// {
	// if(matrix[0][0] == target)
	// return true;
	// else
	// return false;
	// }

	// approach - 1
	// Time Complexity = O(N*M)
	// Space Complexity = O(N*M)
	// ArrayList<Integer> al = new ArrayList<>();

	// for(int[] arr:matrix)
	// {
	// for(int i:arr)
	// {
	// al.add(i);
	// }
	// }

	// return binarySearch(al,target);

	// approach - 2
	// Time Complexity = O(N) + O(logM)
	// Space Complexity = O(1);
	// int n = matrix.length;
	// int m = matrix[0].length;

	// for(int i = 0;i<n;i++)
	// {
	// if(matrix[i][0] <= target && target < matrix[i][m-1])
	// return binarySearch2(matrix[i],target);
	// }

	// return false;

	// approach - 3
	// Time Complexity = O(log(N*M))
	// Space Complexity = O(1)
	int n = matrix.length;
	int m = matrix[0].length;

	int l = 0;
	int r = n * m - 1;

	while (l <= r) {

	    int mid = (l + r) / 2;

	    int row = mid / m;
	    int col = mid % m;

	    if (matrix[row][col] == target)
		return true;
	    else if (matrix[row][col] < target)
		l = mid + 1;
	    else
		r = mid - 1;
	}

	return false;

    }

    public static boolean binarySearch2(int[] arr, int target) {
	int l = 0;
	int r = arr.length - 1;

	while (l <= r) {
	    int mid = (l + r) / 2;

	    if (arr[mid] == target)
		return true;
	    else if (arr[mid] < target)
		l = mid + 1;
	    else
		r = mid - 1;

	}

	return false;

    }

    public static boolean binarySearch1(ArrayList<Integer> al, int target) {
	int l = 0;
	int r = al.size() - 1;

	while (l <= r) {
	    int mid = (l + r) / 2;

	    if (al.get(mid) == target)
		return true;
	    else if (al.get(mid) < target)
		l = mid + 1;
	    else
		r = mid - 1;

	}

	return false;

    }
}
