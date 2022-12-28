/*
 * Calculates the average of 5 assignment marks.
 * 
 * date         20220408
 * @filename    ArraysAndLoops.java
 * @author      Nicole D.
 */

import java.util.Scanner;

public class ArraysAndLoops {

	public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int [] grades = new int [10];
        int total = 0;
        double average;
        final int NUM_OF_MARKS = 5;
        
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("AVERAGE CALCULATOR");
        System.out.println("-------------------");
        
        System.out.println("");
        System.out.println("Enter five grades to find your average:");
        for (int i = 0; i <= 4; i = i + 1){
           grades[i] = keyedInput.nextInt(); // places user input into index
        }
        
        for (int i = 0; i <= 4; i = i + 1){
             total = total + grades[i]; // finds the index of i from grades and adds it 
        }
        
        average = total/NUM_OF_MARKS;
        
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.printf("Your average mark is: " + "%.2f%%",average); 
        System.out.println("");
        System.out.println("-------------------------------");
	}

}
