package microsoft;

public class RemoveDuplicatesFromAString {

	public static String removeDups(String str)
	{
		String res = "";
		
		for(int i=0;i<str.length();i++)
		{
			String temp = "" + str.charAt(i);
			if(!res.contains(temp))
				res += temp;
		}
		
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		String str = "sillyspiders";
		String ans = removeDups(str);
		System.out.println(ans);
		
	}
	
	
}
