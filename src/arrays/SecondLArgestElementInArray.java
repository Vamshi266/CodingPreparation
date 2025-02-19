package arrays;

import java.util.Arrays;

public class SecondLArgestElementInArray {

	//bruteforce
	public static int getSecLar(int arr[])
	{
		int n = arr.length;
		Arrays.sort(arr);
		int max2 = arr[n-1];
		
		for(int i=n-1;i>=1;i--)
		{
			if(arr[i] < max2)
			{
				max2 = arr[i];
				break;
			}
		}
		System.out.println("the largest and second_largest are "+arr[n-1]+","+max2);
		return max2;
		
		
	}
	
	//better
	public static int getSecLar2(int arr[])
	{
		
		int max1 = 0;
		int max2 = 0;
		
		for(int i:arr)
		{
			if( i > max1)
				max1 = i;	
		}
		
		for(int i:arr)
		{
			if((i < max1) && (i != max1))
				max2 = i;
		}
		
		System.out.println("the largest and second_largest are "+max1+","+max2);
		return max2;
		
		
	}
	
	//optimal
	public static int getSecLar3(int arr[])
	{
		int max1 = Integer.MIN_VALUE;
		int	max2 = Integer.MIN_VALUE;
		
		for(int i:arr)
		{
			if(i > max1)
			{
				max2 = max1;
				max1 = i;
			}
			else if((i < max1) && (i > max2))
			{
				max2 = i;
			}
		}
		
		System.out.println("the largest and second_largest are "+max1+","+max2);
		
		return max2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,4,5,6,34,7};
		getSecLar3(arr);
		
		
	}
	
	
	
}
