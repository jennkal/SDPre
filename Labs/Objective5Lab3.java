import java.util.Scanner;

public class Objective5Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNum;
		
		System.out.println("Please enter a number: ");
		userNum = scanner.nextInt();
		
		//solution.
		if(userNum > 0) {
			System.out.println("Number is positive.");
		} else if(userNum < 0) {
			System.out.println("Number is negitive.");
		} else if (userNum == 0) {
			System.out.println("Number is zero.");
		} else {
			System.out.println("Oops, not a valid answer, please enter a number.");
		}
		
		scanner.close();
	}
}