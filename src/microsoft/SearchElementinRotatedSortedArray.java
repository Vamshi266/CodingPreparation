package microsoft;

public class SearchElementinRotatedSortedArray {


	public static boolean searchElement(int[] arr,int key)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(arr[mid] == key) return true;
			
			
			//left part sorted check
			if(arr[low] < arr[mid])
			{
				if(key >= arr[low] && key < arr[mid])
					high = mid-1;
				else
					low = mid+1;
			}
			//right part sorted check
			else
			{
				if(key >= arr[mid] && arr[mid] < high)
					low = mid+1;
				else
					high = mid - 1;
			}
		}
		
		return false;
	}
	
	
}
