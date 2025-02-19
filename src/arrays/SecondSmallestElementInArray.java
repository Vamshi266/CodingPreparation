package arrays;

public class SecondSmallestElementInArray {

	
	
	//optimal
	public static int getSecSmall(int arr[])
	{
		int min1 = arr[0];
		int min2 = Integer.MAX_VALUE;
		
		
		for(int i:arr)
		{
			if(i < min1)
			{
				min1 = i;
				min2 = min1;
			}
			else if((i != min1) && (i < min2))
			{
				min2 = i;
			}
		}
		
		return min2;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4,5,6,34,7};
		
		
		System.out.println("the second smallest element in array = "+getSecSmall(arr));
		
	}
	
	
}
