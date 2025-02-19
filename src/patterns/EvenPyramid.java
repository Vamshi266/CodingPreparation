package patterns;

public class EvenPyramid {

    public static void printEvenPyramid(int n) {
	for (int i = 1; i <= n; i++) {
	    for (int j = n - i; j >= 1; j--) {
		System.out.print(" ");
	    }

	    for (int j = i; j >= 1; j--) {
		System.out.print("* ");
	    }

	    System.out.println();
	}
    }

    public static void main(String[] args) {

	printEvenPyramid(5);

    }

}
