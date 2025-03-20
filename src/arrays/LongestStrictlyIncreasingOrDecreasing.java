package arrays;

public class LongestStrictlyIncreasingOrDecreasing {
    public int longestMonotonicSubarray(int[] arr) {

	// approach - 1
	// Time Complexity = O(N^2)
	// Space Complexity = O(1)
	// int n = nums.length;

	// int maxLen1 = 0;
	// int maxLen2 = 0;

	// for(int i=0;i<n;i++)
	// {
	// for(int j=i;j<n-1;j++)
	// {
	// if(nums[j] < nums[j+1])
	// maxLen1 = Math.max(maxLen1,j - i + 1);
	// else
	// break;
	// }
	// }

	// maxLen1++;

	// for(int i=0;i<n;i++)
	// {
	// for(int j=i;j<n-1;j++)
	// {
	// if(nums[j] > nums[j+1])
	// maxLen2 = Math.max(maxLen2,j - i + 1);
	// else
	// break;
	// }
	// }

	// maxLen2++;

	// return Math.max(maxLen1,maxLen2);

	// approach - 2
	// Time Complexity = O(N)
	// Space Complexity = O(1)
	int maxLen = 1;
	int inc = 1;
	int dec = 1;
	int n = arr.length;

	for (int i = 1; i < n; i++) {
	    if (arr[i] > arr[i - 1]) {
		inc++;
		dec = 1;
	    } else if (arr[i] < arr[i - 1]) {
		dec++;
		inc = 1;
	    } else {
		inc = 1;
		dec = 1;
	    }
	}

	return Math.max(maxLen, Math.max(inc, dec));
    }
}
