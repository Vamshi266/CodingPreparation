package arrays;

import java.util.Arrays;

public class LargestNumberInTheArray {

	
	//bruteforce
	public static int getMax2(int arr[])
	{
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	//optimized
	public static int getMax(int arr[])
	{	
		int max = 0;
		
		for(int i:arr)
		{
			if(max < i) max = i;
		}
		
		return max;	
	}

	
	public static void main(String[] args) {
		
		int arr[] = {1,6,7,2,3,90,21,45,34};
		
		int res = getMax2(arr);
		
		System.out.println("the largest element in the array = "+res);
		
		
	}
	
}
