package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr)
	{
		int n = arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			boolean swap = false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}//for(j)
			if(!swap)
				break;
		}//for(i)
	}
	
	public static void main(String[] args) {
		
		int arr[] = {23,14,78,3,21,89,100};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
}
