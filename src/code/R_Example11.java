package code;

import java.util.ArrayList;
import java.util.List;

/*
 * print all sub-sequence
 * 		combination sum, one element can be added multiple times
 */
public class R_Example11 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> path = new ArrayList<Integer>();

		combinationSum(arr, 0, target, path);
	}

	private static void combinationSum(int[] arr, int index, int target, List<Integer> path) {
		if (index == arr.length) {
			if (target == 0) {
				System.out.println(path);
			}
			return;
		}
		if (arr[index] <= target) {
			path.add(arr[index]);
			combinationSum(arr, index, target - arr[index], path);
			path.remove(path.size() - 1);
		}
		combinationSum(arr, index + 1, target, path);
	}

}
