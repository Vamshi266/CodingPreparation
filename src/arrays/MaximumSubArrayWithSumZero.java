	package arrays;

import java.util.HashMap;

public class MaximumSubArrayWithSumZero {

	//Time Complexity = O(n)
	//Space Complexity = O(n)
	int maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer> hm = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            sum += arr[i];

            if(sum == 0)
             {
                 maxLen = i + 1;
             }
             else
             {
                 if(hm.containsKey(sum))
                 {
                     maxLen = Math.max(maxLen,i - hm.get(sum)); 
                 }
                 else
                 {
                     hm.put(sum,i);
                 }
             }
        }
        
        return maxLen;


    }
	
}
