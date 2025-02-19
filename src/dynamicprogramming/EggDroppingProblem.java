package dynamicprogramming;

public class EggDroppingProblem {

//youtube
//pepcoding - https://bit.ly/3uaVaIi
	
	static int noOfattempts(int n,int k)
	{
		 int[][] dp = new int[n+1][k+1];
	        
	       for(int i=1;i<=n;i++) //eggs
	        {
	            for(int j=1;j<=k;j++) //floors
	            {
	                if(i == 1)
	                 dp[i][j] = j;
	                else if(j == 1)
	                 dp[i][j] = 1;
	                else
	                {
	                    int min = Integer.MAX_VALUE;
	                    for(int cj=j-1,pj=0;cj>=0;cj--,pj++)
	                    {
	                        int v1 = dp[i][cj];
	                        int v2 = dp[i-1][pj];
	                        int val = Math.max(v1,v2);
	                        min = Math.min(min,val);
	                    }
	                    dp[i][j] = min+1;
	                }
	            }
	        }
	        
//	        System.out.print(dp[n][k]);
	        
	        return dp[n][k];
	}
	
}
