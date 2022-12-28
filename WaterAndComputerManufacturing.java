import java.util.Scanner;

public class WaterAndComputerManufacturing {
	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);

			// declare variables
			int computers;
			double total;
			
			//initialize water (as constant)
			final double WATER = 1.5;
			
			// get input
			System.out.println("How many computer do you have?");
			computers = keyedInput.nextInt();
			
			// math 
			total = computers * WATER;
			
			// output
			System.out.println("Your computer used " + String.format("%.2f", total) + " tons of water.");
			
	}

}
