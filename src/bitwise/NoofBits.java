package bitwise;


/*
we can change the base which means 
we can get no of digits needed for representation of that number
in that particular number system 

base = 2 (binary)
base  = 10(decimal)
base = 8(octal)
base = 16(hexadecimal)
*/

public class NoofBits {

	public static void main(String[] args) {
		
		
		int n = 23445;
		int b = 2;
		
		int noOfBits = (int) (Math.log(n) / Math.log(b)) + 1;
		
		System.out.println(noOfBits);
		
		
	}
	
	
}
