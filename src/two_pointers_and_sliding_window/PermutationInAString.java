package two_pointers_and_sliding_window;

public class PermutationInAString {

    // Time Complexity = O(N)
    // Space Complexity = O(26) or O(1)

    // video link = https://www.youtube.com/watch?v=-ub_B9njGn8
    public static boolean optimal(String s1, String s2) {

	int freq[] = new int[26];

	// fill all chars of s1(updating freq of each s1 char to 1)
	for (char c : s1.toCharArray()) {
	    freq[c - 'a']++;
	}

	int l = 0;
	int r = 0;
	int totalChars = s1.length();

	while (r < s2.length()) {

	    // if there is a char in s2 which is present in s1 (ie if it has freq == 1)
	    // reduce totalChars as we found one char
	    if (freq[s2.charAt(r++) - 'a']-- > 0)
		totalChars--;

	    // if totalChars is 0 then we have all the chars in s1 so it's a permutation
	    if (totalChars == 0)
		return true;

	    // if lenght of substring exceeds length of s1(window size) move l
	    // increase the totalChars if it's a chracter present in s1(simply putting it
	    // back in to freq array)
	    if ((r - l) == s1.length() && freq[s2.charAt(l++) - 'a']++ >= 0)
		totalChars++;
	}

	return false;

    }

    public static void main(String[] args) {
	String s1 = "ba";
	String s2 = "eidbaooo";

	boolean res = optimal(s1, s2);
	System.out.println("res = " + res);

    }
}
