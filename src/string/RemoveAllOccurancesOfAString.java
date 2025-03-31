package string;

public class RemoveAllOccurancesOfAString {
    public static String removeOccurrences(String s, String part) {
	while (s.length() > 0) {
	    int index = s.indexOf(part);
	    if (index == -1)
		break;
	    s = s.substring(0, index) + s.substring(index + part.length());
	}

	return s;
    }
}
