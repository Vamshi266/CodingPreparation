package arrays;

public class LongestSequqnceOfOnes {

	public static int longOneSequaence(int arr[])
	{
		
		int count = 0,max = 1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 1)
			{
				count++;
				if(max < count)
					max = count;
			}
			else
			{
				count = 0;
			}
		}
		
		return max;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {0,1,1,1,1,2,3,4,1,1,4,1,1,1,5};
		int res = longOneSequaence(arr);
		System.out.println("longest one's sequence = "+res);
		
	}

}
