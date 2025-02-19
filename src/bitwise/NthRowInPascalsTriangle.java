package bitwise;




/*
 * 
 * 
 * 
 * the nth row in pascal's triangle nc0 + nc1 + nc2 + ...+ncn-1 = 2**n;
 * 
 * 
 */
public class NthRowInPascalsTriangle {

	public static int nthRowInPascalsTriangle(int n)
	{
		return 1 << (n-1);
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
