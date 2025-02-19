package string;

public class LengthWiseEncoding {
	
	public static String stringEncode(String str)
	{
		
		String res = "";
        int count = 0;
        int n = str.length();
        char ch = str.charAt(0);
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == ch)
             count++;
            else
             {
                 res += ch;
                 res += count;
                 count = 1;
                 ch = str.charAt(i);
             }
        }
        
        res += ch;
        res += count;
        
        return res;
		
	}
	
	public static void main(String[] args) {

        String str = "aaaabbbccd";
        
        String res = stringEncode(str);
        
        System.out.println(res);
        
        
        

	}

}
