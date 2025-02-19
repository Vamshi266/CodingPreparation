package recursion;

import java.util.ArrayList;
import java.util.List;


//no of permutations = n!
public class StringPermutations {

	public static void recurpermutate(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean freq[])
	{
		if(ds.size() == 0)
			ans.add(new ArrayList<>(ds));
		
		for(int i=0;i<nums.length;i++)
		{
			if(!freq[i])
			{
				freq[i] = true;
				ds.add(nums[i]);
				recurpermutate(nums,ds,ans,freq);
				ds.remove(ds.size()-1);
				freq[i] = false;
			}
		}
		
		
	}
	
	
	public List<List<Integer>> permutate(int[] nums)
	{
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		 boolean[] freq = new boolean[nums.length];
		 recurpermutate(nums, ds, ans, freq);
		 return ans;
	}
	
}
