package arrays;

import java.util.Arrays;

public class ArrangeBySign {

	//bruteforce
	static void arrangeBySign(int arr[])
	{
		
		int n = arr.length;
		int pos[] = new int[n/2];
		int neg[] = new int[n/2];
		
		
		int j = 0;
		int k = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
				pos[j++] = arr[i];
			else
				neg[k++] = arr[i];
			
		}
		
		for(int i=0;i<n/2;i++)
		{
			arr[2*i] = pos[i];
			arr[(2*i)+1] = neg[i];
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	//optimal
	static void arrangeBySign1(int arr[])
	{
		int n = arr.length;
		int arr2[] = new int[n];
		
		int pos = 0;
		int neg = 1;
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
			{
				arr2[pos] = arr[i];
				pos += 2;
			}
			else
			{
				arr2[neg] = arr[i];
				neg += 2;
			}
		}
		
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {-1,-2,-3,1,2,4};
		arrangeBySign1(arr);
		
		
	}
	
}
