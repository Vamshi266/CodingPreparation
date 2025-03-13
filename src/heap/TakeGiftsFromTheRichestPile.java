package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * 
 * problem link
 * https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
 * 
 */
public class TakeGiftsFromTheRichestPile {

    public static void replaceMax(int arr[]) {

	int j = -1;
	int max = Integer.MIN_VALUE;
	int n = arr.length;
	for (int i = 0; i < n; i++) {
	    if (arr[i] > max) {
		max = arr[i];
		j = i;
	    }
	}

	arr[j] = (int) Math.floor(Math.sqrt(arr[j]));

	System.out.println(Arrays.toString(arr));
	return;
    }

    // Time Complexity = O(N * K)
    // Space Complexity = O(1)
    public long bruteForce(int[] arr, int k) {

	long sum = 0;
	int n = arr.length;

	for (int i = 0; i < k; i++)
	    replaceMax(arr);

	for (int i = 0; i < n; i++) {
	    sum += (long) arr[i];
	}

	return sum;
    }

    public static long optimal(int arr[], int k) {
	int n = arr.length;
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	for (int i = 0; i < n; i++) {
	    pq.add(arr[i]);
	}

	int num = 0;
	for (int i = 0; i < k; i++) {
	    num = pq.poll();
	    num = (int) Math.floor(Math.sqrt(num));
	    pq.add(num);
	}

	long sum = 0;

	while (!pq.isEmpty())
	    sum += (int) pq.poll();

	return sum;
    }

}
