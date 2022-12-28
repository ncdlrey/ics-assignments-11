/**
 * Utilizes different subroutines to return a mathematical calculation.
 * 
 * date         20220505
 * @filename    MyFirstSubroutineProgram.java
 * @author      Nicole Delos Reyes
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class MyFirstSubroutineProgram {
	
	public static int perimeterAndOut (int length) {
		int perimeter = length * 4;
		return (perimeter);
	}
	
	public static double hypotenuseAndOut (int lengthSide1, int lengthSide2) {
		double hypotenuse = (double)Math.sqrt((Math.pow(lengthSide1, 2) + Math.pow(lengthSide2, 2)));
		return (hypotenuse);
	}
	
	public static double cylinderAndOut (int radius, int height) {
		double volumeOfCylinder = (double) (Math.PI * Math.pow(radius, 2) * height);
		return (volumeOfCylinder);

	}
	
	public static double[] medianAndOut (double num1, double num2, double num3, double num4, double num5) {
		double [] grades = {num1, num2, num3, num4, num5};
		Arrays.sort(grades);
		return (grades);
	}
	
	public static double averageAndOut (double num1, double num2, double num3, double num4, double num5) {
		final int TOTAL_NUM_OF_NUMS = 5;
		double average = (num1 + num2 + num3 + num4 + num5) / TOTAL_NUM_OF_NUMS;
		return (average);
	}
	
	
	public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        
        System.out.println("============");
        System.out.println("MATH TIME!");
        System.out.println("============ \n");
        
        System.out.println("What calculation would you like to execute?: \n");
        System.out.println("1. Find perimeter of a sqaure");
        System.out.println("2. Find the hypotenuse of a right triangle");
        System.out.println("3. Find the volume of a cylinder");
        System.out.println("4. Find the median of 5 numbers");
        System.out.println("5. Find the average of 5 numbers");
        System.out.println("6. Exit program \n");

        
        System.out.print("PLEASE SELECT AN OPTION: ");
        int chosenCalculation = keyedInput.nextInt();
        
        while (chosenCalculation != 6) {
        	
        
	        if (chosenCalculation == 1) {
	        	System.out.println("\n=====================================");
	            System.out.println("Finding the perimeter of a sqaure");
	            System.out.println("===================================== \n");
	            
	        	System.out.print("What is the length of one side?: ");
	        	int length = keyedInput.nextInt();
	        	
	        	int perimeter = perimeterAndOut(length);	
	    		System.out.println("The perimeter of this square is: " + perimeter);
	    		
	    		System.out.println("");
	    		System.out.print("\nPLEASE SELECT AN OPTION: ");
	            chosenCalculation = keyedInput.nextInt();
	
	
	        }
	     
	        else if (chosenCalculation == 2) {
	            System.out.println("\n=====================================");
	            System.out.println("Finding the hypotenuse of a right triangle");
	        	System.out.println("===================================== \n");
	
	        	System.out.println("What is the length of side 1?: ");
	        	int lengthSide1 = keyedInput.nextInt();
	        	System.out.println("What is the length of side 2?: ");
	        	int lengthSide2 = keyedInput.nextInt();
	        	
	        	double hypotenuse = hypotenuseAndOut(lengthSide1, lengthSide2);
	    		System.out.printf("The hypotenuse of this right triangle is: " + "%.2f", hypotenuse);
	    		
	    		System.out.println("");
	    		System.out.print("\nPLEASE SELECT AN OPTION: ");
	            chosenCalculation = keyedInput.nextInt();
	        }
	      
	        else if (chosenCalculation == 3) {
	        	System.out.println("\n=====================================");
	            System.out.println("Finding the volume of a cylinder");
	            System.out.println("===================================== \n");
	            
	        	System.out.println("What is the radius?: ");
	        	int radius = keyedInput.nextInt();
	        	System.out.println("What is the height?: ");
	        	int height = keyedInput.nextInt();
	        	
	        	double volume = cylinderAndOut(radius, height);
	        	System.out.printf("The volume of this cylinder is: " + "%.2f", volume);
	        	
	        	System.out.println("");
	    		System.out.print("\nPLEASE SELECT AN OPTION: ");
	            chosenCalculation = keyedInput.nextInt();
	
	        }
	        
	        else if (chosenCalculation == 4) {
	        	System.out.println("\n=====================================");
	            System.out.println("Finding the median of 5 numbers");
	            System.out.println("===================================== \n");
	            
	            System.out.print("Enter your first number: ");
	            double num1 = keyedInput.nextDouble();         
	            System.out.print("Enter your second number: ");
	            double num2 = keyedInput.nextDouble();  
	            System.out.print("Enter your third number: ");
	            double num3 = keyedInput.nextDouble(); 
	            System.out.print("Enter your fourth number: ");
	            double num4 = keyedInput.nextDouble();  
	            System.out.print("Enter your fifth number: ");
	            double num5 = keyedInput.nextDouble();  
	            
	            double[] median = medianAndOut(num1, num2, num3, num4, num5);
	            System.out.println("The median is: " + median[2]);
	            
	            System.out.println("");
	    		System.out.print("\nPLEASE SELECT AN OPTION: ");
	            chosenCalculation = keyedInput.nextInt();
	        }
	        
	        else if (chosenCalculation == 5) {
	        	System.out.println("\n=====================================");
	            System.out.println("Finding the average of 5 numbers");
	            System.out.println("===================================== \n");
	            System.out.print("Enter your first number: ");
	            double num1 = keyedInput.nextDouble();         
	            System.out.print("Enter your second number: ");
	            double num2 = keyedInput.nextDouble();  
	            System.out.print("Enter your third number: ");
	            double num3 = keyedInput.nextDouble(); 
	            System.out.print("Enter your fourth number: ");
	            double num4 = keyedInput.nextDouble();  
	            System.out.print("Enter your fifth number: ");
	            double num5 = keyedInput.nextDouble();    
	             
	            double average = averageAndOut(num1, num2, num3, num4, num5);
	    		System.out.printf("The average of these 5 numbers is: " + "%.2f", average);
	    		
	    		System.out.println("");
	    		System.out.print("\nPLEASE SELECT AN OPTION: ");
	            chosenCalculation = keyedInput.nextInt();
	        }
	        
	        else if (chosenCalculation < 1 || chosenCalculation > 6) {
	        	System.out.print("\nThat's not an option! Please reselect an option from the menu: ");
	        	chosenCalculation = keyedInput.nextInt();
	        }
        }

        System.out.println("\nExiting Program.");
        System.out.println("Goodbye!");
     
    }
}


