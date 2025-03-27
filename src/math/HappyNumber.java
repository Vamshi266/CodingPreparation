package math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {

	Set<Integer> set = new HashSet<>();
	int sum = 0;
	while (true) {
	    if (set.contains(n))
		return false;

	    set.add(n);
	    sum = 0;
	    while (n > 0) {
		int k = n % 10;
		sum += (k * k);
		n /= 10;
	    }
	    if (sum == 1)
		return true;
	    n = sum;
	}

    }
}
