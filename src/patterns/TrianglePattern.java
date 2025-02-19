package patterns;

public class TrianglePattern {

    public static void printTriangle(int n) {

	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= i; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}

    }

    // just change the outer loop from above code;
    public static void printInvertedTriangle(int n) {

	for (int i = n; i >= 1; i--) {
	    for (int j = 1; j <= i; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}

    }

    public static void main(String[] args) {

	printInvertedTriangle(5);

    }

}
