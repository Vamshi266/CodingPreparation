package math.conversion;

public class ConvertStringToInteger {

    public static int optimal(String s) {
	long val = 0;
	int i = 0;
	int sign = 1;
	char[] chars = s.toCharArray();
	int n = s.length();

	if (n == 0)
	    return 0;

	while (chars[i] == ' ') {
	    i++;
	    if (i == n)
		return 0;
	}

	if (chars[i] == '+') {
	    sign = +1;
	    i++;
	} else if (chars[i] == '-') {
	    sign = -1;
	    i++;
	}

	for (; i < n; i++) {
	    if (chars[i] < '0' || chars[i] > '9')
		break;
	    else {
		val *= 10;
		val += chars[i] - '0';

		if (sign * val <= Integer.MIN_VALUE)
		    return Integer.MIN_VALUE;
		else if (sign * val >= Integer.MAX_VALUE)
		    return Integer.MAX_VALUE;
	    }
	}

	return sign * (int) val;
    }

    public static void main(String[] args) {

	String s = "-42";

	int res = optimal(s);

	System.out.println("res = " + res);

    }

}
