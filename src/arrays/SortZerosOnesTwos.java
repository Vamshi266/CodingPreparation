package arrays;

import java.util.Arrays;
import java.util.List;

public class SortZerosOnesTwos {
	
	
	//bruteforce
	public static void sortZerosOnesAndTwos1(int arr[])
	{
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	

	//better
	public static void sortZerosOnesAndTwos(int arr[])
	{
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
				count0++;
			else if(arr[i] == 1)
				count1++;
			else
				count2++;
		}
		
		for (int i = 0; i < count0; i++) 
		{
			arr[i] = 0;
		}
		
		for(int j = count0;j < (count0+count1);j++)
		{
			arr[j] = 1;
		}
		
		for(int k = count0+count1;k < arr.length;k++)
		{
			arr[k] = 2;
		}
	}
	
	//DNF(Dutch national flag) Algorithm
	public static void sortZerosOnesandTwos1(int arr[])
	{
		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = n-1;
		
		
		while(mid <= high)
		{
			if(arr[mid] == 0)
			{
				int temp1 = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp1;
				mid++;
				low++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else
			{
				int temp2 = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp2;
				high--;
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		int arr[] = {2,2,2,1,1,0,0,1,0};	
	}
	
}
