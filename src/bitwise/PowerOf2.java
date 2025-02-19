package bitwise;

public class PowerOf2 {

	public static void main(String[] args) {
		
		
		int n = 23;
		
		if((n & (n-1)) == 0)
			System.out.println("it's a power of 2");
		else
			System.out.println("it's not a power of 2");
		
		
	}
	
	
}
