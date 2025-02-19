package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Threesum {
	
	//bruteforce
	public static ArrayList<ArrayList<Integer>> threeSum(int arr[])
	{
		int n = arr.length;
		Set<ArrayList<Integer>> al = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((arr[i] + arr[j] + arr[k]) == 0)
					{
						
						ArrayList<Integer> ts = new ArrayList<>(3);
						ts.add(arr[i]);
						ts.add(arr[j]);
						ts.add(arr[k]);
						ts.sort(null);
						al.add(ts);
					}
				}
			}
		}
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(al);
		
		return ans;
		
		
	}
	
	public static List<List<Integer>> threeSum2(int arr[])
	{
		int n = arr.length;
		
		Set<List<Integer>> set = new HashSet();
		for(int i=0;i<n;i++)
		{
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<n;j++)
			{
				int third = -(arr[i]+arr[j]);
				if(hashset.contains(third))
				{
					List<Integer> al = Arrays.asList(arr[i],arr[j],third);
					al.sort(null);
					set.add(al);
				}
				hashset.add(arr[j]);
			}
		}
		
		List<List<Integer>> ans = new ArrayList<>(set);
		return ans;
	}
	
	
	public static List<List<Integer>> threeSum3(int arr[])
	{
		
		
		List<List<Integer>> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			if((i!=0) && (arr[i]!=arr[i-1])) continue;
			
			int j = i+1;
			int k = n-1;
			
			while(j<k)
			{
				int sum = arr[i] + arr[j] + arr[k];
				if(sum > 0)
					j++;
				else if(sum < 0)
					k--;
				else
				{
					List<Integer> al = Arrays.asList(arr[i],arr[j],arr[k]);
					ans.add(al);
				}
			}
		}
		
		return ans;
	}
	
	

}
