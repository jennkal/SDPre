import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numThing;
		
		System.out.println("Please enter a number: ");
		numThing = keyboard.nextInt();
		
		if(numThing % 2 == 0) {
			System.out.println("This number is even.");
		} else if(numThing % 2 != 0) {
			System.out.println("This number is odd.");
		} else {
			System.out.println("Oops, please enter a number");
		}
		
		keyboard.close();
	}
}