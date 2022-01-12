import java.math.BigInteger;

public class TotalIncreasingOrDecreasingNumbers {

	public static BigInteger totalIncDec(int n) {
		BigInteger count = BigInteger.ZERO;
		int k = 3;
		if (n == 0) {
			return BigInteger.valueOf(1);
		} else if (n == 1) {
			return BigInteger.valueOf(10);
		} else {
			while (k <= n) {
				count = generate1(0, 1, k, count); //finding all increasing numbers
				count = generate2(0, 9, k, count); //finding all decreasing numbers
				count = count.add(BigInteger.valueOf(-10)); //to remove repetition of numbers like 111, 222 which are both inc. & dec.
				System.out.println(count);
				k++;
			}
			count = count.add(BigInteger.valueOf(99 + 1)); //100 condition satisfying numbers are present b/w 1 - 100
			return count;
		}
	}

	//recursive function to find all increasing numbers
	private static BigInteger generate1(long prefix, long start, int n, BigInteger count) {
		if (n == 0) {
			count = count.add(BigInteger.valueOf(1));
		} else {
			for (long i = start; i < 10; i++)
				count = generate1(10 * prefix + i, i, n - 1, count);
		}
		return count;
	}

	//recursive function to find all decreasing numbers
	private static BigInteger generate2(long prefix, long start, int n, BigInteger count) {
		
		if (n == 0) {
			count = count.add(BigInteger.valueOf(1));
		} else {
			for (long i = start; i >= 0; i--)
				count = generate2(10 * prefix + i, i, n - 1, count);
		}
		return count;
	}

	public static void main(String[] args) {
		BigInteger a = generate2(0, 9, 5, BigInteger.valueOf(0));
		int offset = 1;
		
		BigInteger c = generate2(0, 9, 4, BigInteger.valueOf(0));
		BigInteger b = generate2(0, 8, 5, BigInteger.valueOf(0));
		System.out.println("====Final======>" + a+" = "+b+" + "+c);
		System.out.println("====Final======>" + totalIncDec(8));
	}
}