package arrays;

import java.util.HashMap;

public class CountBadPairs {
    public long countBadPairs(int[] nums) {

	// approach - 1
	// Time Complexity = O(N^2)
	// Space Complexity = O(1)

	// int n = nums.length;
	// long count = 0;

	// for(int i=0;i<n;i++)
	// {
	// for(int j=i+1;j<n;j++)
	// {
	// if(j-i != (nums[j] - nums[i]))
	// count++;
	// }
	// }

	// return count;

	// ----

	// approach - 2
	// Time Complexity = O(NlogN)
	// Space Complexity = O(N)

	// int n = nums.length;
	// long totalPairs = (long) n * (n - 1) / 2;
	// long goodPairs = 0;
	// int[] transformed = new int[n];
	// for (int i = 0; i < n; i++) {
	// transformed[i] = nums[i] - i;
	// }
	// Arrays.sort(transformed);
	// int count = 1;
	// for (int i = 1; i < n; i++) {
	// if (transformed[i] == transformed[i - 1]) {
	// goodPairs += count;
	// count++;
	// } else {
	// count = 1;
	// }
	// }

	// return totalPairs - goodPairs;

	// --

	// approach - 3
	// Time Complexity = O(N)
	// Space Complexity = O(N)
	long n = (long) nums.length;
	long totalPairs = (long) ((n * (n - 1)) / 2);
	long goodPairs = 0L;
	HashMap<Long, Long> hm = new HashMap<>();

	for (int i = 0; i < n; i++) {

	    if (hm.containsKey((long) (i - nums[i])))
		goodPairs += hm.get((long) (i - nums[i]));

	    hm.put((long) (i - nums[i]), hm.getOrDefault((long) (i - nums[i]), 0L) + 1);

	}

	return totalPairs - goodPairs;
    }
}
