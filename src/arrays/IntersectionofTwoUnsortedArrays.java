package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoUnsortedArrays {
	
	//approach 1
	public int[] intersection(int[] nums1, int[] nums2) {
        
	     Set<Integer> s1 = new HashSet<>();
	     for(int i:nums1) s1.add(i);

	     Set<Integer> s2 = new HashSet<>();
	     List<Integer> al = new ArrayList<>();

	     for(int i:nums2)
	     {
	         if(!s1.contains(i)) continue;

	         if(s2.add(i))
	          al.add(i);
	     }

	     int arr[] = new int[al.size()];

	     for(int i=0;i<al.size();i++)
	     {
	         arr[i] = al.get(i);
	     }

	     return arr;

	    }
	
	
	//approach 2
	public int[] intersection2(int[] nums1, int[] nums2) {
		Set<Integer> s1 = new HashSet<>();
		for(int i:nums1) s1.add(i);
		
		List<Integer> al = new ArrayList<>();
		
		for(int i=0;i<nums2.length;i++)
		{
			if(s1.contains(nums2[i]))
				al.add(nums2[i]);
			
			s1.remove(nums2[i]);
		}
		
		int arr[] = new int[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			arr[i] = al.get(i);
		}
		
		return arr;
		
	}
	

}
