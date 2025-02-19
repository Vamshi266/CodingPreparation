package arrays;

import java.util.Arrays;

public class LeftRotateArrayNtimes {

	
	public static void leftRotatebyN(int arr[],int d)
	{
		
		int n = arr.length;
		d = d % n;
		System.out.println(d);
		int temp[] = new int[n];
		
		//storing values to copy after rotation
		for(int i=0;i<d;i++)
		{
			temp[i] = arr[i];
		}
		
		//shifting
		for(int i=d;i<n;i++)
		{
			arr[i-d] = arr[i];
		}
		
		//copying before stored values
		int j = 0;
		for(int i = n-d;i < n;i++)
		{
			arr[i] = temp[j];
			j++;
		}
		
	}
	
	public static void leftRotateByN2(int arr[],int d)
	{
		ReverseArray.revArray(arr, 0, d-1);
		ReverseArray.revArray(arr, d, arr.length-1);
		ReverseArray.revArray(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(arr));
		leftRotateByN2(arr, 3);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
