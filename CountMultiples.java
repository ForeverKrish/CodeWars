public class CountMultiples {

	public static long countSpecMult(long n, long mxval) {
		long result = 0;
		if(n == 0){
			return 0;
		}
		long primeMul = primeMultiple(n); // eg for n = 3; primeMul = 2*3 *5=30
		result = mxval / primeMul;			
		return result;
	}

	//finding first n primes and multiplying them and returning the result
	private static long primeMultiple(long n) {
		long mul = 0;
		boolean flag = false;
		if (n == 1) {
			return 2L;
		}
		if (n  == 2) {
			return 6L;
		}
		int i = 5;
		int count = 2;
		mul = 6;
		
		while (count < n) {
			if (i % 2 == 0) {
				i++;
				continue;
			}
			int top = (int) Math.sqrt(i) + 1;
			for (int j = 3; j < top; j += 2) {
				if (i % j == 0) {
					i++;
					flag = true;
				}
			}
			if(flag == true){
				flag = false;
				continue;
			}
			mul = mul * i;
			count++;
			i++;
		}
		return mul;
	}
	
	public static void main(String args[]){
		System.out.println(countSpecMult(3, 200));
	}
}