package patterns;

public class SquarePattern {

    public static void printSquarePattern(int n) {
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= n; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	printSquarePattern(5);
    }

}
