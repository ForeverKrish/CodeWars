public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {
		
		if (n == 1)
			return 1;
		else
			return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
		
			
	}

	public static void main(String[] args) {
		int x = josephusSurvivor(8,3);
		System.out.println(x);
	}
}