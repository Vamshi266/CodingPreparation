package string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean bruteForce(String ransomNote, String magazine) {
	HashMap<Character, Integer> hm1 = new HashMap<>();
	HashMap<Character, Integer> hm2 = new HashMap<>();

	for (int i = 0; i < magazine.length(); i++) {
	    hm1.put(magazine.charAt(i), hm1.getOrDefault(magazine.charAt(i), 0) + 1);
	}

	for (int i = 0; i < ransomNote.length(); i++) {
	    hm2.put(ransomNote.charAt(i), hm2.getOrDefault(ransomNote.charAt(i), 0) + 1);
	}

	for (Map.Entry<Character, Integer> entry : hm2.entrySet()) {

	    if (!hm1.containsKey(entry.getKey()))
		return false;
	    else if (entry.getValue() > hm1.get(entry.getKey()))
		return false;
	}

	return true;
    }

    public static boolean better(String ransomNote, String magazine) {
	int arr1[] = countChars(magazine);
	int arr2[] = countChars(ransomNote);

	for (int i = 0; i < ransomNote.length(); i++) {
	    char c = ransomNote.charAt(i);

	    if (arr1[c - 97] == 0)
		return false;
	    else if (arr2[c - 97] > arr1[c - 97])
		return false;
	}

	return true;
    }

    public static int[] countChars(String str) {
	int count[] = new int[26];

	for (int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
	    count[c - 97] += 1;
	}

	return count;
    }

    public static boolean optimal(String ransomNote, String magazine) {

	// represents the last seen index of that particular character
	// 26 reprsents 26 chars and in array it stores their last seeen position
	int lastIndex[] = new int[26];

	for (int i = 0; i < ransomNote.length(); i++) {
	    char c = ransomNote.charAt(i);
	    // if you can see it in part of string that remains
	    int j = magazine.indexOf(c, lastIndex[c - 'a']);
	    // if you can't see it return false as it's not present
	    if (j == -1)
		return false;
	    // update last seen index of current char
	    lastIndex[c - 'a'] = j + 1;
	}

	return true;

    }

}
