import java.util.ArrayList;

public class Dec2Fact {

	public static String dec2FactString(long nb) {
		if (nb == 0)
			return "0";
		if (nb == 1)
			return "10";
		if (nb == 2)
			return "100";

		ArrayList<Long> factorial = new ArrayList<>();
		factorial.add(1L);
		factorial.add(1L);

		long fact = 1;
		int i = 2;
		while ((fact < nb) && (i <= 36)) {
			fact = fact * i;
			factorial.add(fact);
			i++;
		}

		StringBuilder result = new StringBuilder();
		i = factorial.size() - 2;
		while (i >= 0) {
			int temp = (int) (nb / factorial.get(i));
			if (temp < 10) {
				result.append(temp);
			} else {
				char ch = (char) (65 + (temp - 10));
				result.append(ch);
			}
			nb = nb % factorial.get(i);
			i--;
		}
		System.out.println(result.toString());
		return result.toString();
	}

	public static long factString2Dec(String str) {
		int len = str.length();
		int i = 0;
		long fact = 1;
		long n = 0L;
		char[] cArray = str.toCharArray();
		while (i < len) {
			if (i >= 2) {
				fact = fact * i;
			}
			//String[] words = " saasc ".trim().split("   ");
			char ch = cArray[len - i - 1];
			int x = ch;
			if ((ch >= 48) && (ch <= 57)) {
				int num = x - 48;
				n = n + fact * num;
			} else if ((ch >= 65) && (ch <= 90)) {
				int num = x - 65 + 10;
				n = n + fact * num;
			}
			i++;
		}
		System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		dec2FactString(464646453L);
		factString2Dec("B70375133110");
		String s = "c";
		//1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"

	}
}