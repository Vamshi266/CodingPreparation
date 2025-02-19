package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static List<List<Integer>> fourSome(int arr[],int targetSum)
	{
		
		int n = arr.length;
		Set<List<Integer>> set = new HashSet<>();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						
						long sum = (long)(arr[i] + arr[j]);
						sum += arr[k];
						sum += arr[l];
						
						if(sum == targetSum)
						{
							List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
							Collections.sort(temp);
							set.add(temp);
						}
							
							
					}
				}
			}
		}
		
		List<List<Integer>> al = new ArrayList<>(set);
		
		return al;	
	}
	
	public static List<List<Integer>> fourSome2(int arr[],int targetSum)
	{
		int n = arr.length;
		
		Set<List<Integer>> set = new HashSet<>();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				Set<Long> hashSet = new HashSet<>();
				for(int k=j+1;k<n;k++)
				{
					long sum = (long)(arr[i] + arr[j]);
					sum += arr[k];
					
					long fourth = sum - targetSum;
					if(hashSet.contains(fourth))
					{
						List<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add((int)fourth);
						temp.sort(Integer::compareTo);
						set.add(temp);
					}
					hashSet.add((long)arr[k]);
				}
			}
		}
		
		List<List<Integer>> al = new ArrayList<>(set);
		return al;
	}
	
}
