package miscellaneous;


// asked in Google
// uses binary search
// the ans lies btw least value in array to sum of array
//youtube = https://youtu.be/AV2rbV4RYls?si=9ueUj1s-nYhhI9ij

public class BooksAllocation {

public static boolean isPossibleSol(int arr[],int b, int m){
		
		int students = 1;
		int spc = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i] > m)
				return false;
			
			if(spc + arr[i] <= m)
			{
				spc += arr[i];
			}
			else
			{
				students++;
				if(students > b)
				{
					return false;
				}
				spc = arr[i];
			}
		}
		
		return true;
		
	}
	
	public static int maxpageCombination(int arr[],int books)
	{
		
		System.out.println("array length = "+arr.length);
		System.out.println("books = "+books);
		if(books > arr.length)				
			return -1;
		
		int l = arr[0];
		int h = 0;
		
		
		for(int i = 0;i < arr.length ; i++)
		{
			if(arr[i] < l)
				l = arr[i];
			
			h += arr[i];
		}
		
//		System.out.println("min = "+l+" max = "+h);
		
		int res = -1;
		
		while(l <= h)
		{
			int m = (l + h)/2;
			if(isPossibleSol(arr,books,m))
			{
				res = m;
				h = m - 1;
			}
			else
			{
				l = m + 1;
			}
		
		}
		
		return res;
		
	}


	
	
	
	public static void main(String[] args) {
		
		int arr[] = {12,34,67,90};
		int b = 2;
		int ans = maxpageCombination(arr, b);
		System.out.println("the max page combination for a single student = "+ans);
		
	}
	
	
}
