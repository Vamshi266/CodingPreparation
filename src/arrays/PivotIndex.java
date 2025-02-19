package arrays;

public class PivotIndex {
	
	//youtube
	//pepcoding - https://bit.ly/48QRwCG
	
	 public int pivotIndex(int[] nums) {

	        int sum = 0;

	        for(int num:nums)
	         sum += num;
	        

	        int lsum = 0;
	        int rsum = sum;

	        for(int i=0;i<nums.length;i++)
	        {
	            rsum -= nums[i];

	            if(rsum == lsum)
	             return i;

	            lsum += nums[i];
	        }

	        return -1;
	        
	    }

}
