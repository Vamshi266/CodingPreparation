package arrays;

public class NumberOfSubarraysWithOddSum {

    // video - https://www.youtube.com/watch?v=ezVeQocEoSs
    public int numOfSubarrays(int[] arr) {

	// approach - 1
	// Time Complexity = O(N^2)
	// Space Complexity = O(1)
	// int n = arr.length;
	// int sum = 0;
	// int count = 0;

	// for(int i=0;i<n;i++)
	// {
	// sum = 0;
	// for(int j=i;j<n;j++)
	// {
	// sum += arr[j];

	// if(sum % 2 != 0)
	// count++;
	// }
	// }

	// return (int)(count % (10e9 + 7));

	// approach - 2
	// Time Complexity = O(N)
	// Space Complexity = O(1)
	int evenCount = 1;
	int oddCount = 0;
	long count = 0;
	int prefixSum = 0;
	int n = arr.length;

	for (int i = 0; i < n; i++) {
	    prefixSum += arr[i];

	    if (prefixSum % 2 == 0) {
		count += oddCount;
		evenCount++;
	    } else {
		count += evenCount;
		oddCount++;
	    }
	}

	return (int) (count % (1e9 + 7));
    }

}
