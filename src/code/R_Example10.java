package code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * print all sub-sequence
 * 		with specific sum
 */
public class R_Example10 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,4,2};
		int sum = 4;
		List<Integer> path = new ArrayList<Integer>();
		
		System.out.println("All subSequence");
		getSumSubsequence(arr, 0, sum, path);
		
		System.out.println("Only 1 subSequence");
		getSumSubsequence_onlyOneSubsequence(arr, 0, sum, path);
		
		
		System.out.println("count of subSequence");
		int count = getSumSubsequence_count(arr, 0, 0, sum);
		System.out.println(count);
	}
	
	//print all sub-sequence whose sum is "sum"
	private static void getSumSubsequence(int[] arr, int index, int sum, List<Integer> path) {
		if(index==arr.length) {
			Integer sumOfPath = path.stream().collect(Collectors.summingInt(Integer::intValue));
			if(sumOfPath.equals(sum)) {
				System.out.println(path);
			}
			return;
		}
		//pick
		path.add(arr[index]);
		getSumSubsequence(arr, index+1, sum, path);
		path.remove(path.size()-1);
		//not pick
		getSumSubsequence(arr, index+1, sum, path);
	}
	
	//print any 1 sub-sequence whose sum is "sum"
	private static boolean getSumSubsequence_onlyOneSubsequence(int[] arr, int index, int sum, List<Integer> path) {
		if(index==arr.length) {
			Integer sumOfPath = path.stream().collect(Collectors.summingInt(Integer::intValue));
			if(sumOfPath.equals(sum)) {
				System.out.println(path);
				return true;
			}
			return false;
		}
		//pick
		path.add(arr[index]);
		if(getSumSubsequence_onlyOneSubsequence(arr, index+1, sum, path)) return true;
		path.remove(path.size()-1);
		//not pick
		if(getSumSubsequence_onlyOneSubsequence(arr, index+1, sum, path)) return true;
		return false;
	}
	
	//count sub-sequence whose sum is "sum"
	private static int getSumSubsequence_count(int[] arr, int index, int s, int sum) {
		//only if array contains +ve elements
		if(s>sum) return 0;
		
		if(index==arr.length) {
			if(s==sum) {
				return 1;
			}
			return 0;
		}
		//pick
		s+=arr[index];
		int l = getSumSubsequence_count(arr, index+1, s, sum);
		s-=arr[index];
		//not pick
		int r = getSumSubsequence_count(arr, index+1, s, sum);
		
		return l+r;
	}
}
