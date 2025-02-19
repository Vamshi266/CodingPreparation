package recursion.sorting;

import java.util.Arrays;

public class Bubblesort {

	public static void sort(int arr[],int n)
	{
		if(n == 1 || n == 0)
			return;
		
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
	
		}
		
		sort(arr,n-1);
		
	}//sort()
	
	public static void main(String[] args) {
		
		int arr[] = {34,12,100,3,67,19};
		System.out.println(Arrays.toString(arr));
		sort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
}
