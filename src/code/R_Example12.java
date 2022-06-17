package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * print all sub-sequence
 * 		combination sum, one element can be added only 1 time
 */
public class R_Example12 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 4, 3, 6, 7 };
		int target = 7;

		System.out.println("Unique COmbination:");
		List<List<Integer>> combinationSum2 = combinationSum2(arr, target);
		combinationSum2.stream().forEach(System.out::println);
	}

	private static List<List<Integer>> combinationSum2(int[] arr, int target) {
		// remove duplicate elements
		arr = Arrays.stream(arr).distinct().toArray();

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (arr == null || arr.length == 0)
			return result;
		ArrayList<Integer> current = new ArrayList<Integer>();
		Arrays.sort(arr);
		combinationSum(arr, target, 0, current, result);
		return result;
	}

	private static void combinationSum(int[] arr, int target, int index, ArrayList<Integer> curr,
			List<List<Integer>> result) {
		if (target == 0) {
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			result.add(temp);
			return;
		}
		for (int i = index; i < arr.length; i++) {
			if (target < arr[i]) {
				return;
			}
			if (i == index || arr[i] != arr[i - 1]) {
				curr.add(arr[i]);
				combinationSum(arr, target - arr[i], i + 1, curr, result);
				curr.remove(curr.size() - 1);
			}
		}
	}

}
