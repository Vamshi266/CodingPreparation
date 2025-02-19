package bitwise;

public class XorTillN {

	public static int xortillN(int n)
	{
		if(n%4 == 0)
			return n;
		else if(n%4 == 1)
			return 1;
		else if(n%4 == 2)
			return n+1;
		else if(n%4 == 3)
			return 0;
		return n;
	}
	
	public static int xorInRange(int a,int b)
	{
		return xortillN(b) ^ xortillN(a-1);
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
