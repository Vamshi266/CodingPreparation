package arrays;

public class NoOfZeroFilledSubArrays {
    public long zeroFilledSubarray(int[] nums) {

	int n = nums.length;
	long total = 0;
	long len = 0;
	for (int i = 0; i < n; i++) {
	    if (nums[i] != 0)
		continue;
	    else {
		while (i < n && nums[i] == 0) {
		    len++;
		    i++;
		}
		total += (long) ((len * (len + 1)) / 2);
		len = 0;
	    }

	}

	return total;

    }
}
