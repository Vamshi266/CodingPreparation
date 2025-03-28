package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    // using min heap
    // Time Complexity = O(NlogK)
    // Space Complexity = O(N)
    public static int[] optimal1(int[] nums, int k) {

	int n = nums.length;

	if (n == 1)
	    return new int[] { nums[0] };

	HashMap<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < n; i++) {
	    hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
	}

	PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
		Comparator.comparingInt(Map.Entry::getValue));

	for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	    pq.add(entry);

	    if (pq.size() > k) {
		pq.poll();
	    }
	}

	return pq.stream().mapToInt(Map.Entry::getKey).toArray();
    }

    // using bucket sort
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int[] optimal2(int[] nums, int k) {

	int n = nums.length;

	if (n == 1)
	    return new int[] { nums[0] };

	HashMap<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < n; i++) {
	    hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
	}

	List<Integer>[] buckets = new ArrayList[n + 1];

	for (int key : hm.keySet()) {
	    int freq = hm.get(key);
	    if (buckets[freq] == null) {
		buckets[freq] = new ArrayList<>();
	    }
	    buckets[freq].add(key);
	}

	int res[] = new int[k];
	int l = 0;

	for (int pos = buckets.length - 1; pos >= 0 && l < k; pos--) {
	    if (buckets[pos] != null) {
		for (Integer i : buckets[pos]) {
		    res[l++] = i;
		}
	    }
	}

	return res;

    }

}
