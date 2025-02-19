package recursion;

public class ArraySum {

	
	public static int arraySum(int arr[],int i)
	{
		if(arr.length == i)
			return 0;
		
		return arr[i]+ arraySum(arr,i+1);
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {23,3,4,5};
		
		System.out.println(arraySum(arr, 0));
		
	}
	
	
	
}
