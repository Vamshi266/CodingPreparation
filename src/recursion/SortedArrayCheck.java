package recursion;

public class SortedArrayCheck {

	public static boolean sortedArrCheck(int arr[],int i)
	{
		if(i == arr.length-1)
			return true;
		
		if(arr[i] < arr[i+1])
			return sortedArrCheck(arr, i+1);	
		
		return false;
	}
	
	public static boolean sortedArrCheck2(int arr[],int i)
	{
		if(i == arr.length-1)
			return true;
		
		return arr[i] < arr[i+1] && sortedArrCheck(arr, i+1);
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,7};
		
		System.out.println(sortedArrCheck2(arr, 0));
		
		
	}
	
	
}
