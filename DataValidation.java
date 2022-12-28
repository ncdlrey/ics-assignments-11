/**
 * 
 * Data validation system that checks for errors in prompted inputs.
 * 
 * duedate      20220513
 * @filename    DataValidation.java
 * @author      Nicole Delos Reyes
 *
 **/

import java.util.Scanner;
public class DataValidation {
	static Scanner keyedInput = new Scanner(System.in);
	
	static String stage1Input;
	static String stage2Input;
	static String stage3Input;
	static String stage4Input;
	static String stage5Input;
	static String stage6Input;
	
	public static void menu() {
		
		System.out.println("=============================================");
		System.out.println("                 DATA VALIDATION");
		System.out.println(" Fill out and complete the following prompts!");
		System.out.println("=============================================");
		
	}
	
	public static String realInt() {
		String tempString = "";
		int value = 0;
		boolean valid = false;
		
		while (valid == false) {
			
			tempString = keyedInput.nextLine();
			
			try {
				value = Integer.parseInt(tempString);
				valid = true;
			}
			
			catch (NumberFormatException e) {
				System.out.println("Invalid input. That is not an integer.");	
				System.out.print("\nPlease re-enter: ");
			}
		}
		
		return tempString;
	}
	
	
	public static void stage1(String stage1Input) {
		while (stage1Input.length() <= 6) {
			System.out.println("'" + stage1Input + "'" + " contains LESS than 6 characters.");
			System.out.print("\nPlease re-enter: ");
			stage1Input = keyedInput.nextLine();
		}
			
	}
	
	public static void stage2(String stage2Input) {

		while (!stage2Input.contains("a")) {
			System.out.println("'" + stage2Input + "'" + " does NOT contain a lowercase “a”");
			System.out.print("\nPlease re-enter: ");
			stage2Input = keyedInput.nextLine();
		}		
	}
	
	public static void stage3(String stage3Input) {
		
		while (!(stage3Input.length() >= 5 && stage3Input.length() <= 15) || stage3Input.contains("z")) {
			if (!(stage3Input.length() >= 5 && stage3Input.length() <= 15)) {
				System.out.println("'" + stage3Input + "' does NOT contain 5-15 characters.");
			}
			if (stage3Input.contains("z")) {
				System.out.println("'" + stage3Input + "' contains the letter “z”.");
			}
			System.out.print("\nPlease re-enter: ");
			stage3Input = keyedInput.nextLine();

		}		
	}
	
	public static void stage4(String stage4Input) {
		
		int value = Integer.parseInt(stage4Input);
		
		while (value < 5 || value > 500) {
			System.out.println("'" + value + "' is not between 5 and 500.");

			System.out.print("\nPlease re-enter: ");
			stage4Input = realInt();
			value = Integer.parseInt(stage4Input);
		}
	}
	
	public static void stage5(String stage5Input) {
		
		int value = Integer.parseInt(stage5Input);
		
		while (value >= 0) {
			System.out.println("'" + value + "' is not a negative integer.");

			System.out.print("\nPlease re-enter: ");
			stage5Input = realInt();
			value = Integer.parseInt(stage5Input);
		}
	}
	
	public static void stage6(String stage6Input) {
		int value = Integer.parseInt(stage6Input);
		
		while (value <= 0 || value % 2 == 0 ) {
			
			if (value <= 0) {
				System.out.println("'" + value + "' is not a positive integer.");
			}
			
			if (value % 2 == 0) {
				System.out.println("'" + value + "' is not a an odd number.");
			}

			System.out.print("\nPlease re-enter: ");
			stage6Input = realInt();
			value = Integer.parseInt(stage6Input);
		}

		
		
	}
	
	
	public static void main(String[] args) {
		
		menu();
		
		System.out.println("\n                  STAGE 1");
		System.out.println("                 ---------");
		System.out.print("Enter a STRING that has more than 6 letters: ");
		stage1Input = keyedInput.nextLine();
		stage1(stage1Input);
		
		System.out.println("\n                  STAGE 2");
		System.out.println("                 ---------");
		System.out.print("Enter a STRING that contains at least one lowercase “a”: ");
		stage2Input = keyedInput.nextLine();
		stage2(stage2Input);
		
		System.out.println("\n                  STAGE 3");
		System.out.println("                 ---------");
		System.out.print("Enter a STRING that contains between 5-15 charcaters and DOESN'T contain the letter “z”: ");
		stage3Input = keyedInput.nextLine();
		stage3(stage3Input);
		
		System.out.println("\n                  STAGE 4");
		System.out.println("                 ---------");
		System.out.print("Enter an INTEGER between 5 and 500: ");		
		stage4Input = realInt();
		stage4(stage4Input);
		
		System.out.println("\n                  STAGE 5");
		System.out.println("                 ---------");
		System.out.print("Enter a NEGATIVE INTEGER: ");		
		stage5Input = realInt();
		stage5(stage5Input);
		
		System.out.println("\n                  STAGE 6");
		System.out.println("                 ---------");
		System.out.print("Stage 6: Enter a positive, odd integer: ");
		stage6Input = realInt();
		stage6(stage6Input);
		
		System.out.println("\nCongratulations! You have completed the data validation test!");
		System.out.println("\nSee you around :-)");
		
		
		

		
		
	}

}
