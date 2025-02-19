package bitwise;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoUniqueElementsIndoublesArray {

	
	
	public static ArrayList<Integer> get2UniqueElements(int arr[],int n)
	{
		Arrays.sort(arr);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<n-1;i+=2)
		{
			if(arr[i] != arr[i+1])
			{
				al.add(arr[i]);
				i-=1;
			}
		}
		
		if(al.size() == 1)
		{
			al.add(arr[n-1]);
		}
		
		
		return al;
		
	}
	
	public static void get2UniqueNum(int arr[])
	{
		
		int x = arr[0];
		
	 	for(int i:arr)
	 	{
	 		x ^= i;
	 	}
	 	
//	 	int k = x & (~(x-1));
	 	int k = x & -x;
	 	int res1 = 0,res2 = 0;
	 	
	 	for(int i:arr)
	 	{
	 		if((i & k) != 0)
	 			res1 ^= i;
	 		else
	 			res2 ^= i;
	 	}
	 	
	 	System.out.printf("the two odd occuring elements are %d %d",res1,res2);
		 	
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		int arr[] = {1,2,3,4,1,2,3,4,5,6};
		get2UniqueNum(arr);
		
	}
	
}
