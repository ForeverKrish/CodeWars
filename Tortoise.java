public class Tortoise {
	public static int[] race(int v1, int v2, int g) {
		if (v1 >= v2) {
			return null;
		} else {
			System.out.println(v1 + " " + v2 + " " + g);
			int[] result = new int[3];
			int relSpeed = v2 - v1;
			if (g == 0) {
				return result;
			}
			double time = (double) g / relSpeed;
			int i = 0;
			System.out.println(time);
			result[0] = (int) (Math.round(time * 100)/100);

			time = (time - (int) time) * 60;
			System.out.println(time);
			result[1] = (int) (Math.round(time * 100)/100);

			time = (time - (int) time) * 60;
			System.out.println(time);
			result[2] = (int) (Math.round(time * 100)/100);

			return result;
		}
	}

	public static void main(String[] args) {
		int[] s = race(647, 697, 154);
		System.out.println(s[0] + " " + s[1] + " " + s[2]);
	}
}