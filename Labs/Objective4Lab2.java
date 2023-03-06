import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
		
		//prompt user input for all of the above int variables.
		System.out.println("Please enter the first whole number to add.");
		num1 = input.nextInt();

		System.out.println("Please enter the second whole number to add.");
		num2 = input.nextInt();

		System.out.println("Please enter the third whole number to add.");
		num3 = input.nextInt();
		
		int sumNum = num1 + num2 + num3;
		
		//prompt user input for above dub variables.
		System.out.println("Please enter the first decimal number to add.");
		dub1 = input.nextDouble();
		
		System.out.println("Please enter the second decimal number to add.");
		dub2 = input.nextDouble();
		
		System.out.println("Please enter the third decimal number to add.");
		dub3 = input.nextDouble();
		
		double sumDub = dub1 + dub2 + dub3;
		
		//print 3 ints and sum.
		System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " + " + "= " + sumNum);
		
		//print 3 dub and sum.
		System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " + " + "= " + sumDub);
		
	}
}