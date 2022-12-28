import java.util.Scanner;
public class Shopping {

	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);

		//declare variables
		int NumOfUSB;
		int NumOfKeyboards;
		int NumOfMice;
		
		double subtotal;
		double total;
		
		//initializing variables as constants
		final double USB = 19.99;
		final double KEYBOARD = 49.99;
		final double MOUSE = 25.99;
		final double TAX = 1.13;
		
		//ask for user input
		System.out.println("How many USB devices will you get?"); 
		NumOfUSB = keyedInput.nextInt();
		System.out.println("How many keyboards will you get?");
		NumOfKeyboards = keyedInput.nextInt();
		System.out.println("How many mice will you get?");
		NumOfMice = keyedInput.nextInt();
		
		//math time woohoo
		subtotal = (NumOfUSB * USB) + (NumOfKeyboards * KEYBOARD) + (NumOfMice * MOUSE);
		total = subtotal * TAX;
		
		//output
		System.out.println("Your subtotal is: $" + subtotal);
		System.out.println("Your total is: " + String.format("%.2f",total));
		
	}

}
