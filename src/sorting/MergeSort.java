package sorting;

import java.util.Arrays;

public class MergeSort {
	
	
	//Time Complexity = O(nlogn)
	//Space Complexity = O(n)
	public static void merge(int arr[], int s, int mid, int e)
    {
       
          int len1 = mid - s + 1;
          int len2 = e-mid;
          
          int arr1[] = new int[len1];
          int arr2[] = new int[len2];
          
          int k = s;
          
          for(int i=0;i<len1;i++)
          {
              arr1[i] = arr[k++];
          }
          
          for(int i=0;i<len2;i++)
          {
             arr2[i] = arr[k++];
          }
         
         int idx1 = 0;
         int idx2 = 0;
         k = s;
         
         while(idx1 < len1 && idx2 < len2)
         {
             if(arr1[idx1] < arr2[idx2])
              arr[k++] = arr1[idx1++];
             else
              arr[k++] = arr2[idx2++];
         }
         
         while(idx1 < len1)
         {
             arr[k++] = arr1[idx1++];
         }
         
         while(idx2 < len2)
         {
             arr[k++] = arr2[idx2++];
         }

    }
	
	 public static void mergeSort(int arr[], int s, int e)
	    {
	       if(s < e)
	       {
	           int mid = (s+e)/2;
	           mergeSort(arr,s,mid);
	           mergeSort(arr,mid+1,e);
	           merge(arr,s,mid,e);
	       }
	    }
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		int temp[] = new int[n];
		
		
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
