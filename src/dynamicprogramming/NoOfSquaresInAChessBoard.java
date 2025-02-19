package dynamicprogramming;

public class NoOfSquaresInAChessBoard {

	
	//recursion
	//Time Complexity = O(n);
	//Space Complexity = O(n);
	public static long noOfSquares1(long n)
	{
		if(n == 1)
			 return 1L;
		
		return (n*n)+noOfSquares1(n-1);
	}
	
	//dp
	//Time Compelxity = O(n)
	//Space Complexity = O(1)
	public static long noOfSquares2(long n)
	{
        Long dp[] = new Long[(int)n+1];
        
        dp[0] = 0L;
        dp[1] = 1L;
        
        for(int i=2;i<=n;i++)
        {
            dp[i] = (long)(i*i) + dp[i-1];
        }
        
        return dp[(int)n];
        
	}
	
	//sum of squares
	//Time Complexity = O(1)
	//Space complexity = O(1)
	public static long noOfSquares3(long n)
	{
		return (n*(n+1)*(2*n+1))/6;
	}
	
	
}
