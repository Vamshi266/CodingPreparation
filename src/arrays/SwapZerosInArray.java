package arrays;




//video : https://www.youtube.com/watch?v=wvcQg43_V8U&t=2105s
public class SwapZerosInArray {

	
	public static void swapZeros(int arr[])
	{
		int j = -1;
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				j = i;
				break;
			}
		}	
		
		for(int i=j+1;i<n;i++)
		{
			if(arr[i] != 0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	
	}
	
}
