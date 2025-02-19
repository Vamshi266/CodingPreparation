package arrays;

public class MaximumSubarrayWithSumK {

	public static int maxSubArrayLength(int arr[],int d)
	{
		
		int length = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			int sum = 0;
			for(int j=i;j<arr.length;j++)
			{
				
				sum += arr[j];
				
				if(sum == d)
					length = Math.max(length, j-i+1);
			}
		}
		
		System.out.println("the max length sub array with given sum = "+length);
		
		
		return length;
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,1,1,1,1,4,2,3};
		maxSubArrayLength(arr, 4);
		
	}
	
	
}
