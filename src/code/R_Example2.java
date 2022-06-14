package code;

import java.util.Scanner;

/*
 * print name n times
 */
public class R_Example2 {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no. of times you want to print your name");
			int n = sc.nextInt();
			
			printName(1, n);
		}
	}

	//Time Complexity: O(n)
	//Space Complexity: O(n)
	private static void printName(int i, int n) {
		if(i>n)
			return;
		System.out.println("Name");
		printName(i+1, n);
	}
}
