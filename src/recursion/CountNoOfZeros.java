package recursion;

public class CountNoOfZeros {

	
	
	static int count;
	public static void countZeros(int n)
	{
		if(n == 0)
			return;
		
		if(n%10 == 0)
			count++;
		
		countZeros(n/10);
	}
	
	public static void main(String[] args) {
		
		countZeros(12030);
		System.out.println(count);
		
		
	}
	
}
