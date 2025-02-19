package arrays;

import java.util.Arrays;

//youtube
//helloworld - https://rb.gy/zp5huz
//code help - https://bit.ly/47K2mc6
public class RotateArray {
	
	public static void reverse(int arr[],int i,int j)
	{
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}
	
	public static void rotate(int arr[],int k)
	{
		int n =arr.length; 
		k = n % k; //if n is less than k
		
		//reverse 0 to n-k-1 part
		reverse(arr,0,n-k-1);
		
		//reverse n-k to n-1 part
		reverse(arr,n-k,n-1);
		
		//reverse whole array
		reverse(arr,0,n-1);
		
	}
	
	public static void rotate2(int arr[],int k)
	{
		int n = arr.length;
		int temp[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			temp[(i+k)%n] = arr[i];
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(arr));
		rotate2(arr,3);
		System.out.println(Arrays.toString(arr));
		
	}
	

}
