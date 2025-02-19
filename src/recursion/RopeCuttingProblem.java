package recursion;

public class RopeCuttingProblem {

	
	public static int maxPieces(int rl,int a,int b,int c)
	{
		int pieces = 0;
		if(rl == 0)
			return 0;
		if(rl < 0)
			return -1;
		
		int temp1 = maxPieces(rl-a, a, b, c);
		int temp2 = maxPieces(rl-b, a, b, c);
		int temp3 = maxPieces(rl-c, a, b, c);
		pieces = Math.max(temp1, Math.max(temp2, temp3));
		
		if(pieces == -1)
			return -1;
		
		return pieces+1;
	}
	
	
	public static void main(String[] args) {
		
		int ans = maxPieces(15, 5, 8, 7);
		System.out.println("max pieces cut = "+ans);
	}
	
}
