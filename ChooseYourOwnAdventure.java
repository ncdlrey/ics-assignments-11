/*
 * A choose your own adventure game about an old man picking up his meds
 * 
 * date         20220325
 * @filename    ChooseYourOwnAdventure.java
 * @author      Nicole Delos Reyes
 */

import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		String ready;
		
		Scanner keyedInput = new Scanner(System.in);
		
		System.out.println("WELCOME TO PEDRO'S ADVENTROS!");
		System.out.println("Help Pedro pick up his arthritis medication");
		System.out.println("-----------------------------");
		
		System.out.print("Are you ready to play?: ");
		ready = keyedInput.next();
		System.out.println("");

		/*validates user input
	 	source: https://stackoverflow.com/questions/45355352/validating-string-input-using-while-loop */
		while(!(ready.equalsIgnoreCase("yes") || ready.equalsIgnoreCase("no"))) {	
			System.out.print("Invalid answer. Please choose yes/no: ");
			ready = keyedInput.next();
			System.out.println("");
		}
				
		if (ready.equalsIgnoreCase("yes")) { 
			System.out.println("AWESOME! Let's start!");
			System.out.println("");
			System.out.println("You are an old man, Pedro, and you're about to head on a nice walk to pick up your arthritis meds");
			System.out.println("Do you grab your...");
			System.out.println("a)brown walking cane   b)sparkly purple walking crane");
			String walkingCrane = keyedInput.next();
			System.out.println("");
		
				
			if (walkingCrane.equalsIgnoreCase("a")) {
				System.out.println("Lame. You make your way down the stairs and slip.");	 
				System.out.println("Do you... " );
				System.out.println("a)call 911    b)walk and limp without your crane");
				String callOrLimp = keyedInput.next();
				System.out.println("");
				
				if (callOrLimp.equalsIgnoreCase("a")) {
					System.out.println("The ambulence picks you up and they put some music on.");
					System.out.println("Katy Perry's 'Last Friday Night' blasts too high for you taste and sends you into shock.");
					
					System.out.println("You die on the way to the hospital from heart attack."); // die
					System.out.println("THE END");
				}
				
				else if (callOrLimp.equalsIgnoreCase("b")) {
					System.out.println("A man on his rollerblades pushes you over and ridicules you for your frail bones");
					System.out.println("Do you...");
					System.out.println("a)take him down with you  b)accept your crumbling physique");
					String rollerbladeMan = keyedInput.next();
					System.out.println("");
					
					if (rollerbladeMan.equalsIgnoreCase("a")) {
						System.out.println("YEAHHH!");
						System.out.println("You succesfully take him down and steal his rollerblades.");
						System.out.println("You zoom on down to the local pharmacy and pick up your meds!");
						System.out.println("DUB!");
						System.out.println("--------------");
						System.out.println("THE END! Thanks for keeping Pedro healthy!");
					}
					else if (rollerbladeMan.equalsIgnoreCase("b")) {
						System.out.println("You succumb to the cold ground and reminisce your youth.");
						System.out.println("These are you final moments.");
						System.out.println("You die of death."); // Die
						System.out.println("THE END");
					}
					else {
						System.out.println("Game over!");
					}
				}
				else {
					System.out.println("Game over!");
				}
			}
						
			else if (walkingCrane.equalsIgnoreCase("b")) {
				System.out.println("What a fashion statement! Too bad it's broken.");
				System.out.println("It splits in half on your way to the crosswalk and a man offers you help.");
				System.out.println("Accept his offer?");
				System.out.println("a)yes  b)no");
				String help = keyedInput.next();
				System.out.println("");
				
				if (help.equalsIgnoreCase("a")) {
				System.out.println("Uh oh. He robs you and leaves you helpless on the sidewalk.");	
				System.out.println("You pass away after a child tramples you on his bicycle."); // die
				System.out.println("THE END");
				}
				
				else if (help.equalsIgnoreCase("b")) {
					System.out.println("You attempt to cross the street on your own but fail to look both ways. ");
					System.out.println("A cement truck rams into you and kills you instantly on impact.");
					System.out.println("You die in the curing cement."); //die
					System.out.println("THE END");
				}
				
				else {
					System.out.println("Game over!");
				}
			}
			else {
				System.out.println("Game over!"); 
			}
		}
		else {
			System.out.println("Ok! Your loss. L.");
		}
	}
}


