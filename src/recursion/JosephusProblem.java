package recursion;

public class JosephusProblem {

	public static int jpsol(int n,int k)
	{
		if(n == 1)
			return 0;
		
		return (jpsol(n-1,k)+k) % n;
	}
	
	
	public static void main(String[] args) {
		
		
		int n = 7;
		int k = 3;
		
		System.out.println(jpsol(n,k));
		
		
	}
	
	
}
