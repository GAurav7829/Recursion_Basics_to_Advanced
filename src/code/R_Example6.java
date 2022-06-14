package code;

/*
 * reverse an array
 */
public class R_Example6 {
	
	private static int countForRecursion = 0;
	
	public static void main(String[] args) {
		int count =0;
		int[] arr = {1,2,3,4,5};
		System.out.println("By For Loop");
		byForLoop(count, arr);
		
		System.out.println("By Recursion	-	2 pointers");
		int[] arr2 = {1,2,3,4,5};
		byRecursion(arr2, 0, arr.length-1);
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println("\n"+countForRecursion);
		
		
		System.out.println("By Recursion	-	1 pointer");
		countForRecursion=0;
		int[] arr3 = {1,2,3,4,5};
		byRecursion(arr3, 0);
		for(int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println("\n"+countForRecursion);
	}

	//Time Complexity: O(n/2) -> O(log n)
	private static void byForLoop(int count, int[] arr) {
		int lastIndex = arr.length;
		
		for(int i=0, j=lastIndex-1; i<j ; i++, j--) {
			swap(arr, i, j);
			count++;
		}
		for(int i = 0;i< lastIndex; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		System.out.println(count);
	}
	
	private static void byRecursion(int[] arr, int i, int j) {
		if(i>j)
			return;
		swap(arr, i, j);
		countForRecursion++;
		byRecursion(arr, i+1, j-1);
	}
	
	private static void byRecursion(int[] arr, int i) {
		if(i>=arr.length/2)
			return;
		swap(arr, i, arr.length-i-1);
		countForRecursion++;
		byRecursion(arr, i+1);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
