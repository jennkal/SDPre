public class Objective3Lab3 {
	public static void main(String[] args) {
		// declare variables for dice.
		int first = 1 + (int)(Math.random() * 6);
		int second = 1 + (int)(Math.random() * 6);
		int third = 1 + (int)(Math.random() * 6);
		int sum = (first + second + third);
		
		// print dice results and the sum of all 3 dice.
		System.out.print(first + " + " + second + " + " + third + " = " + sum);
	}
}