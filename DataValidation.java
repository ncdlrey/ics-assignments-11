
import java.util.Scanner;
public class DataValidation {
	static Scanner keyedInput = new Scanner(System.in);
	
	static String stage1Input;
	static String stage2Input;
	static String stage3Input;
	static String stage4Input;
	
	public static void menu() {
		
		System.out.println("=============================================");
		System.out.println("                 DATA VALIDATION");
		System.out.println(" Fill out and complete the following prompts!");
		System.out.println("=============================================");
		/*
		System.out.println("Stage 1: The user must enter a string that is greater than 6 characters long.");
		System.out.println("Stage 2: The user must enter a string that contains at least one lowercase “a”.");
		System.out.println("Stage 3: The user must enter a string that is between 5 and 15 characters long, and does not contain the letter “z”.");
		System.out.println("Stage 4: The user must enter an integer between 5 and 500.");
		System.out.println("Stage 5: The user must enter a negative integer.");
		System.out.println("Stage 6: The user must enter a positive, odd integer.");
		*/
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
				System.out.println("Invalid input. That is not an integer.");			}
		}
		
		return tempString;
	}
	
	
	public static void stage1() {
		System.out.println("\n                  STAGE 1");
		System.out.println("                 ---------");
		System.out.print("Enter a STRING that has more than 6 letters: ");
		stage1Input = keyedInput.nextLine();
		
		while (stage1Input.length() <= 6) {
			System.out.println("'" + stage1Input + "'" + " contains LESS than 6 characters.");
			System.out.print("\nPlease re-enter: ");
			stage1Input = keyedInput.nextLine();
		}
			
	}
	
	public static void stage2() {
		System.out.println("\n                  STAGE 2");
		System.out.println("                 ---------");
		System.out.println("Enter a STRING that contains at least one lowercase “a”. ");
		stage2Input = keyedInput.nextLine();
			
		
		while (!stage2Input.contains("a")) {
			System.out.println("'" + stage2Input + "'" + " does NOT contain a lowercase “a”");
			System.out.print("\nPlease re-enter: ");
			stage2Input = keyedInput.nextLine();
		}		
	}
	
	public static void stage3() {
		System.out.println("\n                  STAGE 3");
		System.out.println("                 ---------");
		System.out.println("Enter a STRING that contains between 5-15 charcaters and DOESN'T contain the letter “z”. ");
		stage3Input = keyedInput.nextLine();
		
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
	
	public static void stage4() {
		
		System.out.println("\n                  STAGE 4");
		System.out.println("                 ---------");
		System.out.println("Enter an INTEGER between 50 and 500.");		
		stage4Input = realInt();
		
		int value = Integer.parseInt(stage4Input);
		
		while (value < 50 || value > 500) {
			System.out.println("'" + value + "' is not between 50 and 500.");

			System.out.print("\nPlease re-enter: ");
			stage4Input = realInt();
			value = Integer.parseInt(stage4Input);
		}
		
		System.out.println("Everything works!");	
	}
	
	
	
	public static void main(String[] args) {
		
		menu();
		
		stage1();
		
		stage2();
		
		stage3();
		
		stage4();
		

		
		
	}

}
