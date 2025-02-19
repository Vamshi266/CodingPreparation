package arrays;

public class FirstMissingPositiveNumber {

	public static int firstMissingPositiveNumber(int arr[])
	{
		if(arr == null)
			return 1;
		
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i] <= 0)
				arr[i] = n+1;
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
			{
				int index = Math.abs(arr[i])-1;
				if(index < n)
					if(arr[index] > 0)
						arr[index] = -(arr[index]);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
				return i+1;
		}
		
		return n+1;
	}
	
	public static void main(String[] args) {
			
		int arr[] = {3,2,-6,1,0};
		int res = firstMissingPositiveNumber(arr);
		System.out.println(res);
		
	}
	
}
