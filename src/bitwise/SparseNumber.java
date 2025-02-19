package bitwise;

public class SparseNumber {

	public static boolean sparse(int n)
	{
		if((n & (n>>1)) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean sparse2(int n)
	{
		int count = 0;
		int r = 0;
		while(n>0)
		{
			r = n%2;
			if(r == 1)
			{
				count++;
				if(count == 2)
					return false;
			}
			n = n/2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean res = sparse2(2);
		
		System.out.println("sparse - "+res);
		
	}
	
}
