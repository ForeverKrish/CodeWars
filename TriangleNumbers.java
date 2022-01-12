public class TriangleNumbers {

	public static Boolean isTriangleNumber(long number) {
		// FORMULA: Triangle num = n*(n + 1) / 2
		// REVERSE FORMULA: n^2 + n - 2* num = 0
		if (number == 1 || number == 0) {
			return true;
		} else if (number > 2) {
			// So sqrt(b^2 - 4 * a * c) should be a whole number for Triangle numbers
			double x = Math.sqrt(1 + 4 * (2 * number));
			System.out.println(x + " " + Math.ceil(x));
			if (x == Math.ceil(x)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Boolean x = isTriangleNumber(10);
	}
}