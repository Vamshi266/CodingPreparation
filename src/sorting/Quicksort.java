package sorting;

import java.util.Arrays;

public class Quicksort {

	
	public static void quickSort(int arr[],int s,int e)
	{
		if(s >= e)
			return;
		
		
		int p = partition(arr,s,e);
		quickSort(arr, s, p-1);
		quickSort(arr, p+1,e);
		
		
	}
	
	public static int partition(int arr[],int s,int e)
	{
		int pivot = arr[s];
		
		int cnt = 0;
		for(int i=s+1;i<=e;i++)
		{
			if(arr[i] <= pivot)
				cnt++;
		}
		
		int pivotIndex = s + cnt;

		//swap first element with pivot element
		int temp = pivot;
		arr[s] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
		int i = s;
		int j = e;
		
		while(i < pivotIndex && j > pivotIndex)
		{
			
			//move i until elements are lesser than pivot
			while(arr[i] <= pivot)
				i++;
			
			//move j until elements are greater than pivot
			while(arr[j] > pivot)
				j--;
			
			// if there are elements such that arr[i] > pivot and arr[j] < pivot
			//swap them and move pointers
 			if(i < pivotIndex && j > pivotIndex)
			{
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	
	public static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int n = arr.length;

		System.out.print("before sorting :");
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, n-1);
		System.out.print("after sorting :");
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
}
