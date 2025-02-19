package arrays;

public class EqualPartitionIndex {

	
	 //Time Complexity = O(n)
	 //Space Complexity = O(n)
	 static int equalPartition(int n, long arr[]) {

	        long prefix[] = new long[n];
	        long suffix[] = new long[n];

	        prefix[0] = arr[0];
	        suffix[n-1] = arr[n-1];
	        
	        //populating prefix sum
	        for(int i=1;i<n;i++)
	        {
	            prefix[i] = prefix[i-1] + arr[i];
	        }

	        //populating suffix sum
	        for(int i=n-2;i>=0;i--)
	        {
	            suffix[i] = suffix[i+1] + arr[i];
	        }

	        for(int i=0;i<n;i++)
	        {
	            if(prefix[i] == suffix[i])
	             return i;
	        }

	        return -1;

	    }
	
}
