package arrays;

import java.util.ArrayList;

public class PascalsTriangle {
	
	
	
	public static int factorial(int n)
	{
		if(n == 0)
			return 1;
		
		return n*factorial(n-1);
	}
	
	public static int nCr(int n,int r)
	{
		int res = 1;
		
		for(int i=0;i<r;i++)
		{
			res = res * (n-i);
			res = res / i+1;
		}
		
		return res; 
	}
	
	public static int printNthNum(int n,int r)
	{
		return factorial(n) / (factorial(r) * factorial(n-r));
	}
	
	public static void printNthRow(int n)
	{
		int ans = 1;
		System.out.print(ans+" ");
		for(int i=1;i<n;i++)
		{
			ans = ans * (n-i);
			ans = ans / i;
			System.out.print(ans+" ");
		}
		
	}
	
	public static void printPascalsTriangle(int n,int r)
	{
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=1;j<=i;j++)
			{
				temp.add(nCr(i-1,j-1));
			}
			
			al.add(temp);
		}
		
	}
	
	public static void printPascalsTriangle2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			printNthRow(i);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("pascals triangle");
//		System.out.println(printNthNum(5,4))
//		System.out.print("nth row = ");
//		printNthRow(4);
		printPascalsTriangle2(4);
		
	}

}
