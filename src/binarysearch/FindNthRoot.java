package binarysearch;

public class FindNthRoot {
	static int nthRoot(int x, int n) {

        int low = 1,high = x;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int p = (int)Math.pow(mid,n);
            if(p == x)
            {
                // System.out.print(p);
             return mid;
            }
            else if(p < mid)
             low = mid + 1;
            else
             high = mid - 1;
        }
        
        return -1;

    }
}
