package code;

/*
 * Multiple Recursion Calls
 * find nth Fibonacci number
 */
public class R_Example8 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("By For loop: " + byForLoop(n));
		
		System.out.println("By Recursion: "+byRecursion(n));
	}

	private static int byForLoop(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		
//		System.out.print(a+" "+b+" ");

		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
//			System.out.print(c+" ");
		}
		return b;
	}
	
	private static int byRecursion(int n) {
		if(n<=1)
			return n;
		return byRecursion(n-1) + byRecursion(n-2);
	}
	
	/*
	 * n=3
	 * 				a1=f(3)
	 * 		b1=f(2)			b2=f(1)
	 * c1=f(1)		c2=f(0)
	 * 
	 * execution order: c1, c2, b1, b2, a1
	 */
	
}
