package code;

import java.util.ArrayList;
import java.util.List;

/*
 * print all sub-sequence
 * 		a contagious/non-contagious sequence, which follows the order
 */
public class R_Example9 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		
		List<Integer> path = new ArrayList<Integer>();
		
		subSequence(arr, 0, path);
	}
	
	//Time Complexity: O(2^n)
	//Space Complexity: O(n)
	private static void subSequence(int[] arr, int index, List<Integer> path) {
		if(index == arr.length) {
			if(path.size()>0) {
				System.out.println(path);
			}else {
				System.out.println("[]");
			}
		}else {
			//sub-sequence without including the current index
			path.add(arr[index]);
			subSequence(arr, index+1, path);
			//remove recently inserted elements
			path.remove(path.size()-1);
			//sub-sequence including the current index
			subSequence(arr, index+1, path);	
		}
		return;
	}

}
