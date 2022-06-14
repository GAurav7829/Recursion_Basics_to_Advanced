package code;

/*
 * sum of Ist n numbers
 */
public class R_Example4 {
	
	public static void main(String[] args) {
		int n = 3;
		
		int sum1 = sum(n);
		
		System.out.println(sum1);
		
		int sum = 0;
		sum2(n, sum);
	}

	//way 1	-	functional
	private static int sum(int n) {
		if(n==0)
			return 0;
		return n + sum(n-1);
	}

	//way 2
	private static void sum2(int n, int sum) {
		if(n<1) {
			System.out.println(sum);
			return;
		}
		sum2(n-1, sum+n);
	}
}
