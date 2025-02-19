package matrix;



//a sqaure matrix a magic square 
//1)all row sum's will be equal
//2)all col sum's will be equal
//3)all diagonal sum's will be equal
//rowsum == colsum == diagonalsum
public class MagicSquare {

	public static boolean magicSquare(int[][] arr) {

		// diagonal check

		int n = arr.length;

		int diagonal1Sum = 0;
		int diagonal2Sum = 0;

		for (int i = 0; i < n; i++) {
			diagonal1Sum += arr[i][i];
		}

		int i = 0;
		int j = n - 1;
		while (i < n) {
			diagonal2Sum += arr[i][j];

			i++;
			j--;
		}

		if (diagonal1Sum != diagonal2Sum)
			return false;

		// row check

		int rowSum[] = new int[n];

		for (i = 0; i < n; i++) {
			int sum = 0;
			for (j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			rowSum[i] = sum;
			if (i > 0) {
				if (rowSum[i] != rowSum[i - 1])
					return false;
			}
		}

		// colCheck

		int colSum[] = new int[n];
		for (j = 0; j < n; j++) {
			int sum = 0;
			for (i = 0; i < n; i++) {
				sum += arr[i][j];
			}

			colSum[j] = sum;

			if (j > 0) {
				if (colSum[j] != colSum[j - 1])
					return false;
			}

		}

		if (diagonal1Sum != colSum[0] || diagonal1Sum != rowSum[0])
			return false;

		return true;
	}

	public static void main(String[] args) {

		int arr[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		boolean res = magicSquare(arr);

		System.out.print("magic-square : " + res);

	}

}
