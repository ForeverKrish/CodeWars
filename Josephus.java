import java.util.LinkedList;
import java.util.List;

public class Josephus {
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		System.out.println(items);
		List<T> result = new LinkedList<>();
		result = compute(items, k, 0, result);
		return result;

	}

	private static <T> List<T> compute(List<T> items, int k, int start, List<T> result) {
		if (items.size() == 0) {
			return result;
		}
		int i = start + k - 1;
		if (i < items.size()) {
			result.add(items.get(i));
			items.remove(i);
		} else {
			i = i - items.size() - (k - 1);
		}
		result = compute(items, k, i, result);
		return result;

	}

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		List<Integer> result = josephusPermutation(l, 3);
		System.out.println(result);
	}
}