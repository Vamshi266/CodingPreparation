package arrays;

import java.util.Arrays;

public class LeftRotateArray {

	public static void leftrotate(int arr[])
	{
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = temp;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		leftrotate(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
}
