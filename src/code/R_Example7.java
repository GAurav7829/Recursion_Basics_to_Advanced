package code;

/*
 * string is palindrome
 */
public class R_Example7 {
	
	public static void main(String[] args) {
		String str = "12321";
		boolean flag = checkPalindrome(str, 0);
		
		System.out.println(flag);
	}

	private static boolean checkPalindrome(String str, int i) {
		if(i>=str.length()/2)
			return true;
		
		if(str.charAt(i)!=str.charAt(str.length()-i-1))
			return false;
		
		return checkPalindrome(str, i+1);
	}
	
}
