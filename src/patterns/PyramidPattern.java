package patterns;

public class PyramidPattern {

    public static void printPyramid(int n) {
	for (int i = 1; i <= n; i++) {
	    for (int j = n - i; j >= 1; j--) {
		System.out.print(" ");
	    }

	    // here j = (2*i)-1
	    for (int j = (2 * i) - 1; j >= 1; j--) {
		System.out.print("*");
	    }

	    System.out.println();
	}

    }

    public static void main(String[] args) {

	printPyramid(4);

    }

}
