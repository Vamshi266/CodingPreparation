package math;

public class GcdOfArray {

	static int gcd(int a,int b)
    {
        if(b == 0)
         return a;
        
        return gcd(b,a%b);
    }

    static int gcdOfArray(int n,int arr[]){

        int res = arr[0];

        for(int i=0;i<arr.length-1;i++)
        {
            res = gcd(res,arr[i+1]);
        }

        return res;
    }
	
}
