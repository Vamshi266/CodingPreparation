package arrays;

public class MaxProductSubarray {

	
	//bruteforce
	public static int maxProdSubArray2(int arr[])
	{
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i;j<n;j++)
			{
				int prod = 1;
				for(int k = i;k<j;k++)
				{
					prod = prod * arr[k];
				}
				max = Math.max(max, prod);
			}
		}
		
		return max;
	}
	
	//better
	public static int maxProdSubArray1(int arr[])
	{
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			int prod = 1;
			for(int j=i;j<n;j++)
			{
				prod = prod * j;
				max = Math.max(prod, max);
			}
		}
		
		return max;
	}
	
	
	
	
	
	//optimal
	public static int maxProdSubArray(int arr[])
	{
		int n = arr.length;
		
		int prefix = 1,suffix = 1;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;
			
			prefix = prefix * arr[i];
			suffix = suffix * arr[n-i-1];
			max = Math.max(max, Math.max(prefix, suffix));
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {2,3,-2,4};
		
		int ans = maxProdSubArray(arr);
		
		System.out.println("the max product sub array = "+ans);
		
	}
	
}
