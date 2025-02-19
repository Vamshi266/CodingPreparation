package binarysearch;

public class UpperAndLowerBound {
	
	 //lower bound
    public static int lowerBound(int arr[],int n,int k)
    {
        int low = 0;
        int high = n-1;
        int ans = n;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(arr[mid] >= k)
             {
                 ans = mid;
                 high = mid-1;
             }
             else
              low = mid+1;
        }
        
        return ans;
    }

}
