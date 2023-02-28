import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
		sumNum = num1 + num2 + num3;
		sumDub = dub1 + dub2 + dub3;
		
		//prompt user input for all of the above int variables.
		System.out.print("Please enter the first whole number to add.");
		int intnum1 = scanner.nextInt();
		
		System.out.print("Please enter the second whole number to add.");
		int num2 = scanner.nextInt();

		System.out.print("Please enter the third whole number to add.");
		int num3 = scanner.nextInt();		
		//prompt user input for above dub variables.
		System.out.print("Please enter the first decimal number to add.");
		double dub1 = scanner.nextDouble();
		
		System.out.print("Please enter the second decimal number to add.");
		double dub2 = scanner.nextDouble();
		
		System.out.print("Please enter the third decimal number to add.");
		double dub3 = scanner.nextDouble();
		//print 3 ints and sum.
		System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " + " + "= " + sumNum);
		
		//print 3 dub and sum.
		System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " + " + "= " + sumDub);
		
	}
}