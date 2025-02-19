package math;



//perfect square rules
//1. all the perfect squares end in 0,1,4,5,6 and 9
//2. if the last digit is 1,4,5 and 9 then 
//the second last digit will be even
//3. if the last digit is 6 then the 
//second last digit will be odd
//4. if the alst digit is 5
//then the second last digit = 2
//5. the digital num will be either a odd number or 4
 

public class PerfectSquare {
	
	public static boolean perfectSquare(int n)
	{
		int root = (int)Math.sqrt(n*n);
		
		return (root*root) == n ? true : false;
	}

}
