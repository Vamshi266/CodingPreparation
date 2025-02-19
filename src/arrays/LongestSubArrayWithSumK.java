package arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

	
	public static int longSubArrWithSumk(int arr[],int k)
	{
		int sum = 0;
		int maxLen = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			if(sum == k)
				maxLen = Math.max(maxLen, i+1);
			
			
			int rem = sum - k;
			
			if(hm.containsKey(rem))
			{
				int len = i - hm.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			
			if(!hm.containsKey(sum))
			{
				hm.put(sum, i);
			}
		}
		
		return maxLen;
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {2,3,4,0,0,0,3,4};
		int res = longSubArrWithSumk(arr, 3);
		System.out.println("the sub array with max len = "+res);
		
	}
	
}
