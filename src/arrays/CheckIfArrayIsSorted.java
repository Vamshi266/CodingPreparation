package arrays;

public class CheckIfArrayIsSorted {

	public static boolean checkSorted(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,4,5,6,34};
		System.out.println("the array is sorted : "+checkSorted(arr));
		
	}
	
	
}
