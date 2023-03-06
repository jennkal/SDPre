public class Objective7Lab4 {
	public static void main(String[] args) {
		
		//variables.
		int sum = 0;
		int count = 1;
		
		//while loop, increment count and update sum.
		while (count <= 20) {
			
			sum = sum + count;
			
			++count;
		}
		//print out final/total sum.
		System.out.println(sum);
	}
}