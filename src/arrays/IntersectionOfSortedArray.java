package arrays;

import java.util.TreeSet;

public class IntersectionOfSortedArray {
	
	public static void intersectionOfSortedArr(int arr1[],int arr2[])
	{
		TreeSet<Integer> al = new TreeSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
					al.add(arr1[i]);
				
			}
		}
		
		System.out.println(al.toString());
		
		
	}
	
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,2,3,3,4,5,6};
		int arr2[] = {2,3,3,5,6,6,7};
		
		
		intersectionOfSortedArr(arr1, arr2);
		
	}

}
