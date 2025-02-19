package math;

public class LeapYear {

	//programiz
	//blog - https://rb.gy/tcukhx
	
	
	//a number is a leap year which is divisable by 4 expect for century year(years ending with 00eg:-1900)
	//a century year is a leap year when it is divisable by 400
	public static boolean isLeapYear(int n)
	{
		boolean flag = false;
		
        if(n % 4 == 0)
        {
            if(n % 100 == 0)
            {
                if(n%400 == 0)
                 flag = true;
                else
                 flag = false;
            }
            else
            {
                flag = true;
            }
        }
        else
        {
            flag = false;
        }
        
        return flag;
	}
	
}
