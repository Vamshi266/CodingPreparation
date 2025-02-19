package recursion;

public class FastExponentiation {

	public static int power(int a,int b)
	{
		if(b == 0)
			return 1;
		if(b == 1)
			return a;
		
		int res = power(a,b/2);
		
		if(b%2 == 0)
			return res * res;
		else
			return a * res * res;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(power(2,20));
		
	}
	
}
