public class ToSmallest2 {
	public static long[] smallest(long n) {
		long[] result = { n, 0L, 0L };
		Long minValue = n;
		int len = minValue.toString().length();
		int i = 0, j = 0;
		while (i < (len)) {
			StringBuilder num = new StringBuilder(new Long(n).toString());
			char ch = num.charAt(i);
			num.deleteCharAt(i);
			j = 0;
			while (j < len) {
				if (i == j) {
					j++;
					continue;
				}
				num.insert(j, ch);
				Long temp = Long.parseLong(num.toString());
				if (temp < minValue) {
					minValue = temp;
					result[0] = minValue;
					result[1] = i;
					result[2] = j;
				}
				num.deleteCharAt(j);
				j++;
			}
			i++;
		}
		i = (int) result[1];
		j = (int) result[2];
		if (i > j) {
			StringBuilder num = new StringBuilder(new Long(n).toString());
			char ch = num.charAt(j);
			num.deleteCharAt(j);
			num.insert(i, ch);
			if (result[0] == Long.parseLong(num.toString())) {
				result[1] = j;
				result[2] = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// Long n = 255741992990667008L;
		Long n = 689855073980318464L;
		long[] l = smallest(n);
		System.out.println(l[0] + " " + l[1] + " " + l[2]);
		// expected:<[25574199299[066708, 15], 0]> but was:<[25574199299[667008,
		// 11], 0]>
		// 255741992990667008L
		// 25574199299667008
		// 25574199299066708
		// expected:<[1878630[0289, 10], 0]> but was:<[1878630[2809, 6], 0]>
		// 187863002809
		// 18786300289
		// 18786302809
		// expected:<[119989884756, 4, [0]]> but was:<[119989884756, 4, [1]]>
		// 199819884756
		// expected:<[14[1659282137356336, 15, 0]]> but
		// was:<[14[6592821373563136, 0, 1]]>
		// 416592821373563136
		// 141659282137356336
		// 146592821373563136
		// expected:<[1273837[14754859264, 14], 0]> but
		// was:<[1273837[47548591264, 6], 0]>
		// 273837147548591264
		// 127383714754859264
		// 127383747548591264
		// expected:<[11[1773689266186272, 1, 7]]> but
		// was:<[11[8117736926686272, 12, 0]]>
		// 181177369266186272
		// 11[1773689266186272
		// 11[8117736926686272
	}
}