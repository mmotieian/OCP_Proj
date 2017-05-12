package review;

import java.util.ArrayList;
import java.util.List;

public class PrisonBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prison(3, 2, new int[] { 1, 2, 3 }, new int[] { 1, 2 });
		prison(3, 3, new int[] { 2 }, new int[] { 2 });
		prison(1, 1, new int[] { 1 }, new int[] { 1 });
		prison(3, 3, new int[] { 2 }, new int[] { 2 });

	}

	private static long prison(int n, int m, int[] h, int[] v) {
		// TODO Auto-generated method stub

		// n = 1
		// m = 1
		// h = {1}
		// v = {1}
		// nn = {0,2}
		// mm = {0,2}
		// modified prison
		List<Integer> nn = new ArrayList<>();
		List<Integer> mm = new ArrayList<>();

		for (int i = 0; i < n + 2; i++) {
			nn.add(i);
		}
		for (Integer i : h)
			if (nn.contains((Integer) i))
				nn.remove((Integer) i);

		for (int i = 0; i < m + 2; i++) {
			mm.add(i);
		}
		for (int i : v)
			if (mm.contains((Integer) i))
				mm.remove((Integer) i);

		long nLargest = 0;
		long mLargest = 0;
		for (int i = 0; i < nn.size() - 1; i++) {
			if ((nn.get(i + 1) - nn.get(i)) > nLargest)
				nLargest = nn.get(i + 1) - nn.get(i);
		}

		for (int i = 0; i < mm.size() - 1; i++) {
			if ((mm.get(i + 1) - mm.get(i)) > mLargest)
				mLargest = mm.get(i + 1) - mm.get(i);
		}

		System.out.println(nLargest * mLargest);
		return nLargest * mLargest;
	}

}
