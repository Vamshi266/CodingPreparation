package arrays;

public class MaximumSubArraySum {

	
	//kadens algorithm
	//Time Complexity :- O(n)
    //Space Complexity :- O(1)
	public static int maxSubArrSum(int arr[])
	{
		
		int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
		int n = arr.length;
			
			for (int i = 0; i < n; i++) {
				
				curr_sum += arr[i];
				if(curr_sum > max_sum)
					max_sum = curr_sum;
				
				if(curr_sum < 0)
					curr_sum = 0;
				
			}
			
			return max_sum;
		
	}
	
	//try all subarrays
	//Time Complexity :- O(n^2)
	//Space Complexity :- O(1)
	public static int maxSubArrSum2(int arr[])
	{
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			int sum = 0;
			for(int j=i;j<n;j++)
			{
				sum += arr[j];
				
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,7,-7,2,-3,5};
		int res = maxSubArrSum(arr);
		System.out.println("max sub array sum = "+res);
		
	}
	
	
}
