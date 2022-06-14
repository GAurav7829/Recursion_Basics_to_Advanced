package code;

/*
 * factorial of n
 */
public class R_Example5 {
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(factorial(n));
		
	}

	//Time Complexity: O(n)
	//Space Complexity: O(n)
	private static int factorial(int n) {
		if(n<1)
			return 1;
		return n * factorial(n-1);
	}

	
}
