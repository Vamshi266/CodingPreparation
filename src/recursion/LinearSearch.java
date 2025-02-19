package recursion;

public class LinearSearch {

	
	public static boolean linearSearch(int arr[],int key,int i)
	{
		
		if(i == arr.length)
			return false;
		
		
		return (arr[i] == key) || linearSearch(arr,key,i+1);
		
		
	}
	
	public static int linearSearch2(int arr[],int key,int i)
	{
		if(i == arr.length)
			return -1;
		
		if(arr[i] == key)
			return i;
		
		
		return linearSearch2(arr, key, i+1);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,7,18,9,10};
		System.out.println(linearSearch2(arr, 9, 0));
		
		
		
	}
	
}
