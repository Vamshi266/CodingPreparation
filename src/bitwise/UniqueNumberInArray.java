package bitwise;

/* concept is if we xor
 * every number starting with value 0
 * finally the only number will be result 
 * of this operation
 * eg :- [2,1,3,4,5,2,5,3,1]
 * */

/*if even the no's are -ve the xor works the same
as above
eg :- [-2,-3,-2,-3,-1,4,-2]
*/



public class UniqueNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,1,2,3,4,5};
		int xor_res = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			xor_res ^= arr[i];
		}

		
		// modren way
		/*
		 * for(int i:arr) { xor_res ^= i; }
		 */
		System.out.println("unique element in the array = "+xor_res);	}
	
}
