package recursion;

public class NtoObOne {

	
	public static void NtoOne(int n)
	{
		if(n == 0)
			return;
		
		System.out.println(n);
		NtoOne(n-1);
	}
	
	public static void main(String[] args) {
		
		NtoOne(5);
		
	}
	
}
