package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public static String optimal(int n, int k) {
	int fact = 1;
	List<Integer> al = new ArrayList<>();
	for (int i = 1; i < n; i++) {
	    fact = fact * i;
	    al.add(i);
	}

	al.add(n);

	StringBuilder res = new StringBuilder();
	k = k - 1;

	while (true) {
	    res.append(al.get(k / fact));
	    al.remove(k / fact);

	    if (al.size() == 0)
		break;

	    k = k / fact;
	    fact = fact % al.size();
	}

	return res.toString();

    }

}
