package recursion;

import java.util.ArrayList;
import java.util.List;
public class StringPermutations2 {
	
	
	public static void swap(int index,int i,int[] nums)
	{
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i]= temp;
		return;
	}
	
	
	//number of permutations = n!
	//time complexity = O(n!) * O(n)
	//space complexity = O(1)
	
	
	
	public static void recurPermuate(int index,int[] nums,List<List<Integer>> ans)
	{
		if(index == nums.length)
		{
			List<Integer> ds = new ArrayList<>();
			for(int i=0;i<nums.length;i++)
			{
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		
		for(int i=index;i<nums.length;i++)
		{
			swap(i,index,nums);
			recurPermuate(index+1, nums, ans);
			swap(i,index,nums);
		}
		
	}
	
	public static List<List<Integer>>  permute(int[] nums)
	{
		List<List<Integer>> ans = new ArrayList<>();
		recurPermuate(0, nums, ans);
		return ans;
	}
	
	public static void main(String[] args) {
		

		int[] nums = {1,2,3};
		
		List<List<Integer>> ans = permute(nums);
		for(List<Integer> l:ans)
		{
			System.out.println(l);
		}
		
	}
	
	
	
}
