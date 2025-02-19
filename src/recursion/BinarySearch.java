package recursion;

public class BinarySearch {

	public static boolean binarySearch(int arr[],int key,int low,int high)
    {
        if(low <= high)
          {
            
                int mid = (low + high) / 2;
                if(arr[mid] == key)
                    return true;
                    
                if(arr[mid] > key)
                    return binarySearch(arr,key,low,mid-1);
                else
                    return binarySearch(arr,key,mid+1,high);
          }
          
          return false;
    }
	
}
