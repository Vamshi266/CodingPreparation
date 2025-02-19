package string;

public class IsSubsequence {
	
//two pointer approach
 //Time Complexity = O(s.length + t.length);
 //Space Complexity = O(1)
 public static boolean isSubsequence(String s, String t) {
        
        int i = 0;
        int j = 0;

        while(j < s.length() && i < t.length())
        {
            if(s.charAt(j) == t.charAt(i))
            {
                i++;
                j++;
            }
            else
                i++;
        }

        if(j == s.length())
         return true;
        else
         return false;
    }

}
