package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

	
	
	//bruteforce
	public static boolean twoSum(int arr[],int target)
	{
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if((arr[i]+ arr[j]) == target)
					return true;
				
			}
		}
		
		return false;
		
	}
	
	//better
	public static boolean twoSum2(int arr[],int target)
	{
		int req = 0;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			req = target - arr[i];
			if(hm.containsKey(req))
				return true;
			
			hm.put(arr[i], i);
			
		}
		
		return false;
		
		
	}
	
	public static boolean twoSum3(int arr[],int target)
	{
		int left = 0;
		int right = arr.length-1;
		int sum = 0;
		
		Arrays.sort(arr);
		
		while(left < right)
		{
			sum = arr[left] + arr[right];
			if(sum == target)
				return true;
			
			if(sum < target)
				left++;
			else
				right--;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,1,2,2,1};
		boolean res = twoSum3(arr, 22);
		System.out.println("two sum available :  "+res);
		
		
	}
	
	
}
