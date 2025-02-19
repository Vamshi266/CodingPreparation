package recursion;

public class MergeSort {

	public static long inversionCount(long arr[],long n)
	{
		
		if(arr.length == 1 || arr.length == 0)
			return 0;
		long temp[] = new long[(int)n];
		return mergeSort(arr,temp,0,n-1);
	}
	
	public static long mergeSort(long arr[],long temp[],long left,long right)
	{
		long inv_count = 0,mid;
		
		if(left < right)
		{
			mid = (left+right)/2;
			inv_count  = mergeSort(arr,temp,left,mid);
			inv_count += mergeSort(arr,temp,mid+1,right);
			inv_count +=  merge(arr,temp,left,mid+1,right);
		}
		
		
		return inv_count;
	}
	
	public static long merge(long arr[],long temp[],long left,long mid,long right)
	{
		
		long i,j,k;
		long invCount = 0;
		
		i = left;
		j = mid;
		k = left;
		
		while((i <= mid-1) && (j <= right))
		{
			if(arr[(int)i] <= arr[(int)j])
			{
				temp[(int)k++] = arr[(int)i++];	
			}
			else
			{
				temp[(int)k++] = arr[(int)j++];
				invCount += (mid - i);
			}
		}
		
		while( i <= mid-1)
		{
			temp[(int)k++] = arr[(int)i++];
		}
		
		while(j <= right)
		{
			temp[(int)k++] = arr[(int)j++];
		}
		
		for(i=left;i<=right;i++)
		{
			arr[(int)i] = temp[(int)i];
		}
		
		return invCount;
	}
	
	public static void main(String[] args) {
		
		long arr[] = {2,4,1,3,5};
		long n = 5;
		System.out.println(inversionCount(arr,n));
	}
	
}
