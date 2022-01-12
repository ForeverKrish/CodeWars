public class TheClockwiseSpiral {

	public static int[][] createSpiral(int N) {
		int result[][] = new int[N][N];

		if (N == 0) {
			return result;
		}

		int i = 0;
		int count = 0;
		int x = 0;
		int y = 0;
		result[0][0] = ++count;

		if (N == 1) {
			return result;
		}

		while (i < N / 2) {

			while (y < N - 2 - i)
				result[x][++y] = ++count;
			result[x][++y] = ++count;
			while (x < N - 2 - i)
				result[++x][y] = ++count;
			result[++x][y] = ++count;
			while (y > 1 + i)
				result[x][--y] = ++count;
			result[x][--y] = ++count;
			while (x > 1 + i)
				result[--x][y] = ++count;
			i++;
		}
		if (N % 2 != 0) {
			result[i][i] = ++count;
		}
		return result;
	}

	public static void main(String[] args) {
		int N = 16;
		int[][] arr = createSpiral(N);
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				System.out.print(arr[a][b] + "\t");
			}
			System.out.println();
		}
	}
}