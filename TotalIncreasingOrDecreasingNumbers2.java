import java.math.BigInteger;
import java.util.HashMap;

public class TotalIncreasingOrDecreasingNumbers2 {

	private static HashMap<Integer,BigInteger> map = new HashMap<>();
	
	public static BigInteger totalIncDec(int n) {
		
		BigInteger count = BigInteger.ZERO;
		int k = 3;
		if (n == 0) {
			return BigInteger.valueOf(1);
		} else if (n == 1) {
			return BigInteger.valueOf(10);
		} else {
			while (k <= n) {
				int offset = 0;
				BigInteger temp = BigInteger.valueOf(0);
				if(map.containsKey(k-1)){
					temp = map.get(k-1);
					offset = 1;
				}
				BigInteger temp1 = generate1(0, (1+offset), k, BigInteger.valueOf(0)); //finding all increasing numbers
				BigInteger temp2 = generate2(0, (9-offset), k, BigInteger.valueOf(0)); //finding all decreasing numbers
				temp1 = temp1.add(temp);
				temp1 = temp1.add(temp2);
				map.put(k, temp1);
				count = count.add(temp1);
				count = count.add(BigInteger.valueOf(-10)); //to remove repetition of numbers like 111, 222 which are both inc. & dec.
				System.out.println(count.add(BigInteger.valueOf(100)));
				k++;
			}
			count = count.add(BigInteger.valueOf(99 + 1)); //100 condition satisfying numbers are present b/w 1 - 100
			return count;
		}
	}

	//recursive function to find all increasing numbers
	private static BigInteger generate1(long prefix, int start, int n, BigInteger count) {
		if ((n-1) == 0) {
			count = count.add(BigInteger.valueOf(10 - start));
		} else {
			for (int i = start; i < 10; i++)
				count = generate1(10 * prefix + i, i, n - 1, count);
		}
		return count;
	}
	
	//recursive function to find all decreasing numbers
	private static BigInteger generate2(long prefix, int start, int n, BigInteger count) {
		if ((n-1) == 0) {
			count = count.add(BigInteger.valueOf(start+1));
		} else {
			for (int i = start; i >= 0; i--)
				count = generate2(10 * prefix + i, i, n - 1, count);
		}
		return count;
	}

	public static void main(String[] args) {
		//System.out.println("\n====Final======>" + generate1(0,1,5,BigInteger.valueOf(0)));
		//System.out.println("\n====Final======>" + generate1(0,2,5,BigInteger.valueOf(0)));
		System.out.println("\n====Final======>" + totalIncDec(250));
		//System.out.println("\n====Final======>" + totalIncDec(6));
		//System.out.println("\n====Final======>" + totalIncDec(5));
		//System.out.println("\n====Final======>" + totalIncDec(6));
	}
}