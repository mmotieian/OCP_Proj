package com.amazon.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] blocks = { "5", "Z", "X", "9", "+", "+" };
		System.out.println(totalScore(blocks, 6));
	}

	public static int totalScore(String[] blocks, int n) {

		List<Integer> intList = new ArrayList<>();
		int sum = 0;

		if (n != blocks.length)
			return 0;

		for (int i = 0; i < blocks.length; i++) {

			try {
				intList.add(Integer.parseInt(blocks[i]));
				sum += Integer.parseInt(blocks[i]);
			} catch (NumberFormatException e) {

				// the list doesn't start with a number
				if (intList.isEmpty())
					intList.addAll(Arrays.asList(0, 0));
				else if (intList.size() == 1)
					intList.add(0, 0);

				// it's not an integer
				int lastIndex = intList.size() - 1;
				switch (blocks[i]) {
				case "X":
					// last score
					sum += 2 * intList.get(lastIndex);
					intList.set(lastIndex, 2 * intList.get(lastIndex));
					break;
				case "Z":
					sum -= intList.remove(lastIndex);
					break;
				case "+":
					sum += (intList.get(lastIndex) + intList.get(intList.size() - 2));
					intList.add(intList.get(lastIndex) + intList.get(intList.size() - 2));
					break;
				default:
					return 0;

				}
			}
		}

		return sum;
	}

}
