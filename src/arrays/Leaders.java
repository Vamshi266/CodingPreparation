package arrays;

import java.util.ArrayList;

public class Leaders {

	//bruteforce
	public static ArrayList<Integer> getNoOfLeaders(int arr[])
	{
		int n = arr.length;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			boolean flag = true;
			loop: for(int j=i;j<n;j++)
			{
				//checking for leader condition
				if(arr[j] > arr[i])
				{
					flag = false;
					break loop;
				}
			}
				
			if(flag)
			{
				al.add(arr[i]);
			}
		}
		
		
		return al;
		
	
	}
	
	//optimal
	public static ArrayList<Integer> getNoOfLeaders2(int arr[])
	{
		
		int max = Integer.MIN_VALUE;
		int n = arr.length;
		ArrayList<Integer> al = new ArrayList<>();
		//check from back of arr if the element is greater than all the maximum 
		//from the until the iteration we can say that it is greater than all other elements 
		//hence we can add it as a leader
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i] > max)
			{
				al.add(arr[i]);
				max = arr[i];
			}
		}
		
		return al;
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,22,12,3,0,6};
		
		ArrayList<Integer> al = getNoOfLeaders2(arr); 
		System.out.println(al);
		
		
	}
}
