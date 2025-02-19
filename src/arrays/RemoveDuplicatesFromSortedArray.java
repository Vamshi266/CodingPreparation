package arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

	//bruteforce
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static int removeDups1(int arr[])
	{
		HashSet<Integer> uniqueset = new HashSet();
		
		for(int i:arr)
			uniqueset.add(i);
		
		return uniqueset.size();
	}
	
	//better approach
	public static int removeDups2(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
					arr[j] = -1;
			}
		}
		
		int count = 0;
		for(int i:arr)
		{
			if(i != -1)
				count++;
		}
		
		
		return count;
	}
	
	//optimal approach
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static int removeDups3(int arr[])
	{
		int i = 0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i] != arr[j])
			{
				arr[i+1] = arr[j];
				i++;
			}
		}
		
		return i+1;
			
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,3};
		
		System.out.println("the no of non duplicate elements are "+removeDups3(arr));
		
	}
	
}
