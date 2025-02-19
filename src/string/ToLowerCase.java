package string;

public class ToLowerCase {
	
//Ascii
//65-90 A-Z;
//97-122 a-z;
	
public String toLowerCase(String s) {
        
        char c[] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                c[i] = ch;
               continue;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                 c[i] = (char)((int)ch+32);
                System.out.print(c[i]);
            }
        }

        String res =  new String(c);
        return res;
    }
}
