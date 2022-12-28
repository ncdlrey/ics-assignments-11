/*
 * Allows user to enter a number to either be squared, cubed , or raised to the power of another prompted number. 
 * date         20210331
 * @filename    CubesAndSquaresAndPowers
 * @author      Nicole Delos Reyes
 */

import java.util.Scanner;
import java.lang.Math;

public class CubesAndSquaresAndPowers {
	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		int userNum;
		int answer;
		
		final int SQUARE = 2;
		final int CUBE = 3;
				
		// Output MENU
		System.out.println("------------------------------------");
		System.out.println("WELCOME TO SQAURES & CUBES & POWERS!");
		System.out.println("------------------------------------");
		System.out.println("");
		
		System.out.println("What would you like to do today?");
		System.out.println("");
		
		System.out.println("1… Find the value of a number squared (NOTE: 2² = 2 x 2)");
		System.out.println("2… Find the value of a number cubed (NOTE: 2³ = 2 x 2 x 2)");
		System.out.println("3… Find the value of a number, to any power");
		System.out.println("4… Exit");
		System.out.println("");
		
		System.out.print("Please select an option: ");
	    int programTask = keyedInput.nextInt();
	    
	    // Sentinel value of 4 to terminate the while loop
	    while(programTask !=4){ 
	    	
	    	// Squares the user's input
	        if (programTask == 1) {
	        	System.out.println("");
	        	System.out.print("Enter a number to square: ");
	        	userNum = keyedInput.nextInt();
	        	System.out.println("Answer = " + Math.pow(userNum, SQUARE));
	          
	         // Prompt the user again
	        	System.out.println("");
	        	System.out.print("Please select an option: ");
	        	programTask = keyedInput.nextInt();
	        }
	        
	        // Cubes the user's input
	        else if (programTask == 2) {
	        	System.out.println("");
	        	System.out.print("Enter a number to cube: ");
	        	int cubedNum = keyedInput.nextInt();
	        	System.out.println("Answer: " + Math.pow(cubedNum, CUBE)); 
	        	
	        // Prompt the user again
	        	System.out.println("");
	        	System.out.print("Please select an option: ");
		        programTask = keyedInput.nextInt();
	        }
		        
		    // Puts the user user's input to any given number
	        else if (programTask == 3) {
	        	System.out.println("");
		    	System.out.print("Enter a a base number: ");
		    	int baseNum = keyedInput.nextInt();
		    	System.out.print("Enter a power: ");
		    	int power = keyedInput.nextInt();
		    	System.out.println("Answer = " + Math.pow(baseNum, power));
		    	
	        // Prompt the user again
		    	System.out.println("");
	        	System.out.print("Please select an option: ");
		        programTask = keyedInput.nextInt();
		    }
	        
	        // Validate user input 
	        else {
	        	System.out.println("");
	        	System.out.println("----------------");
	        	System.out.println("INVALD INPUT ");
	        	System.out.println("----------------");
	        	System.out.println("");

	    		System.out.print("Please reselect an option: ");
	    	    programTask = keyedInput.nextInt();
	        }
	    }
	    System.out.println("Exiting program.");
	}
}
