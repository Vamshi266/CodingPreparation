package patterns;

public class MirroredTrianglePattern {

    public static void printMirroredTrianglePattern(int n) {

	for (int i = 1; i <= n; i++) {
	    for (int j = n - i; j >= 1; j--) {
		System.out.print(" ");
	    }

	    for (int j = 1; j <= i; j++) {
		System.out.print("*");
	    }

	    System.out.println();

	}

    }

    public static void printInvertedMirroredTrianglePattern(int n) {
	// for inverted triangle (just change outer loop)
	for (int i = n; i >= 1; i--) {
	    for (int j = n - i; j >= 1; j--) {
		System.out.print(" ");
	    }

	    for (int j = 1; j <= i; j++) {
		System.out.print("*");
	    }

	    System.out.println();
	}
    }

    public static void main(String[] args) {

	printInvertedMirroredTrianglePattern(5);

    }

}
