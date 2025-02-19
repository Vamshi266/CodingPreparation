package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class UnionOfSortedArrays {

	public static void unionOfSortedArr1(int arr1[],int arr2[])
	{
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<n1;i++)
		{
			hm.put(arr1[i],hm.getOrDefault(arr1[i], 0)+1 );
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			hm.put(arr2[j],hm.getOrDefault(arr2[j], 0)+1);
		}
		
		for(int it:hm.keySet())
			al.add(it);
		
		System.out.println(al.toString());
	}
	
	public static void unionOfSortedArr2(int arr1[],int arr2[])
	{
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i:arr1)
			ts.add(i);
		
		for(int j:arr2)
			ts.add(j);
		
		System.out.println(ts.toString());
	}
	
	
	public static void unionOfSortedArr3(int arr1[],int arr2[])
	{
		int i=0,j=0;
		
		int n = arr1.length;
		int m = arr2.length;
		
		ArrayList<Integer> union = new ArrayList<>();
		
		while((i < n) && (j < m))
		{
			if(arr1[i] <= arr2[j])
			{
				if((union.size() == 0) || union.get(union.size()-1) != arr1[i])
				{
					union.add(arr1[i]);
				}
				i++;
			}
			else
			{
				if((union.size() == 0) || union.get(union.size()-1) != arr2[j])
				{
					union.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(i < n)
		{
			if(union.get(union.size()-1) != arr1[i])
				union.add(arr1[i]);
			i++;
		}
		
		while(j < m)
		{	
			if(union.get(union.size()-1) != arr2[j])
			 union.add(arr2[j]);
			j++;
		}
		
		System.out.println(union.toString());
		
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = {2,3,4,4,5,11,12};
		
//		unionOfSortedArr1(arr1, arr2);
//		unionOfSortedArr2(arr1, arr2);
		unionOfSortedArr3(arr1, arr2);
		
		
	}
	
	
}
