/*Prompt user for their salary then determine the amount of income tax that they owe. 
 * 
 * modified     20220216
 * date         20220216
 * @filename    IncomeTax.java
 * @author      Nicole Delos Reyes
 * @version     1.0
 * @see         ICS3U Content
 */


import java.util.Scanner;
public class IncomeTax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		double salary;
		
		final int FIRST_TAXABLE_INCOME = 50197;
		final int SECOND_TAXABLE_INCOME = 100392;
		final int THIRD_TAXABLE_INCOME = 155625;
		final int FOURTH_TAXABLE_INCOME = 221708;
		
		final double FIRST_TAX = 0.15;
		final double SECOND_TAX = 0.205;
		final double THIRD_TAX = 0.26;
		final double FOURTH_TAX = 0.29;
		final double FINAL_TAX = 0.33;
		
		double incomeTaxDue = 0;
		
		
		System.out.println("How much salary do you make?: ");
		salary = in.nextDouble();
		
		
		if(salary <= FIRST_TAXABLE_INCOME && salary > 0){
			incomeTaxDue = salary*FIRST_TAX;
		}
		else if(FIRST_TAXABLE_INCOME < salary && salary <= SECOND_TAXABLE_INCOME){
			incomeTaxDue = (salary*FIRST_TAX)+((salary-FIRST_TAXABLE_INCOME)*SECOND_TAX);
		}
		else if(SECOND_TAXABLE_INCOME < salary && salary <= THIRD_TAXABLE_INCOME){
			incomeTaxDue = (salary*FIRST_TAX)+((salary-FIRST_TAXABLE_INCOME)*SECOND_TAX)+((salary-SECOND_TAXABLE_INCOME)*THIRD_TAX);
		}
		else if(THIRD_TAXABLE_INCOME < salary && salary <= FOURTH_TAXABLE_INCOME) {
			incomeTaxDue = (salary*FIRST_TAX)+((salary-FIRST_TAXABLE_INCOME)*SECOND_TAX)+((salary-SECOND_TAXABLE_INCOME)*THIRD_TAX)+((salary-THIRD_TAXABLE_INCOME)*FOURTH_TAX);
		}
		else if(FOURTH_TAXABLE_INCOME < salary){
			incomeTaxDue = (salary*FIRST_TAX)+((salary-FIRST_TAXABLE_INCOME)*SECOND_TAX)+((salary-SECOND_TAXABLE_INCOME)*THIRD_TAX)+((salary-THIRD_TAXABLE_INCOME)*FOURTH_TAX)+((salary-FOURTH_TAXABLE_INCOME)*FINAL_TAX);
		}
		else {
			System.out.println("Input Error. Please only input a number, no letters or special characters.");
		}
		
		System.out.println("You owe: $" + String.format("%.2f",incomeTaxDue));

	}

}
