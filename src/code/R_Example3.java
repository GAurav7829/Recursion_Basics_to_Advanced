package code;

/*
 * print 1-n
 * 
 * print n-1
 */
public class R_Example3 {
	
	public static void main(String[] args) {
		int n = 3;
		
		print_1_to_n(1, n);
		
		System.out.println();
		
		print_n_to_1(n);
		
		System.out.println();
		
		print_1_to_n_backTracking(n);
		
	}

	//Time Complexity: O(n)
	//Space Complexity: O(n)
	private static void print_1_to_n(int i, int n) {
		if(i>n)
			return;
		System.out.print(i + " ");
		print_1_to_n(i+1, n);
	}
	
	private static void print_n_to_1(int i) {
		if(i<1)
			return;
		System.out.print(i + " ");
		print_n_to_1(i-1);
	}
	
	private static void print_1_to_n_backTracking(int n) {
		if(n<1)
			return;
		
		print_1_to_n_backTracking(n-1);
		System.out.print(n + " ");
	}
}
