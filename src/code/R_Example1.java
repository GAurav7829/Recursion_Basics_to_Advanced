package code;

public class R_Example1 {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		System.out.println("Recusion Start");
		printCount();
		System.out.println("Recursion Ends");
	}
	
	private static void printCount() {
		//Base Condition that stop the recursion loop
		if(count==3)
			return;
		
		System.out.println(count++);
		printCount();	//calling function itself
	}
}
