package bitwise;

public class MaxAndValue {

	public static int maxAndValue(int arr[])
	{
		int mask = 0;
		int res = 0;
		
		for(int i=31;i>=0;i--)
		{
			mask = 1 << i | res;
			int count = checkBits(arr,mask);
			if(count >= 2)
			{
				res = res | mask;
			}
			
		}
		
		return res;
	}
	
	public static int checkBits(int arr[],int mask)
	{
		int count = 0;
		
		for(int i:arr)
		{
			if((mask & i) == mask)
			{
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {16,9,6,13};
		
		System.out.println(maxAndValue(arr));
		
	}
	
	
}
