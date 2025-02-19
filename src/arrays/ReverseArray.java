package arrays;

public class ReverseArray {

	
	public static void revArray(int arr[],int l,int r)
	{
		int n = arr.length;
		while(l < r)
		{
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
