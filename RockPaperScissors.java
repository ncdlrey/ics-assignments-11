/**
 * 
 * Rock paper scissors game that will return statistics of the match.
 * 
 * duedate      20220506
 * @filename    RockPaperScissors.java
 * @author      Nicole Delos Reyes
 *
 **/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	static Scanner keyedInput = new Scanner(System.in);

	static int rockTimes;
	static int paperTimes;
	static int scissorsTimes;
	
	static int winTimes;
	static int lossTimes;
	static int tieTimes;
	
	static String [] moves = {};
	static String[] allUserMoves = {"", "", "", "", "", ""};
	static String [] allResults = {"", "", "", "", "", ""};

	static String userMove;
	
	
	public static void menu() {
		
		System.out.println("=========================================");
		System.out.println("           ROCK PAPER SCISSORS");
		System.out.println("=========================================");
		System.out.println("                  RULES:");
		System.out.println("         - Rock beats scissors");
		System.out.println("         - Scissors beats paper");
        System.out.println("         - Paper beats rock\n");
		System.out.println("  (Please enter 'r', 'p', or 's' only)");
        System.out.println("               GOODLUCK!\n");
	}
	
	
	public static String getUserMove(int roundCount) {
		
		System.out.println("=========================================\n");
		System.out.println("ROUND " + roundCount);

		System.out.print("Your move: ");
		userMove = keyedInput.next();
										
		while (!(userMove.equalsIgnoreCase("r") || userMove.equalsIgnoreCase("p") || userMove.equalsIgnoreCase("s"))) {
			
			System.out.println("---");
			System.out.println("Invalid input. Please enter r, p, or s");	
			System.out.println("---");

			System.out.print("Your move: ");
			userMove = keyedInput.next();
			System.out.println("");	
			
		}
		return userMove;	
	}
	
	
	public static String getComputerMove() {
		
		int max = 3;
		int min = 1;
		
		Random rand = new Random();
		String cpuMove = "";
		
		int cpu = rand.nextInt((max - min) + 1) + min;

		if (cpu == 1) {
			System.out.println("Computer's move: r\n");
			cpuMove = "r";
		}
		
		else if (cpu == 2) {
			System.out.println("Computer's move: p\n");
			cpuMove = "p";
		}
		
		else if (cpu == 3) {
			System.out.println("Computer's move: s\n");
			cpuMove = "s";
		}
		return cpuMove;
		
	}
	
	
	public static String roundStatus(String user, String computer) {
		
		String result = "";
		
		if (computer.equalsIgnoreCase(user)) {
			System.out.println("You tied this round!");
			result = "t";
			
		}
		
		else if (computer.equalsIgnoreCase("r") && user.equalsIgnoreCase("p") || computer.equalsIgnoreCase("p") && user.equalsIgnoreCase("s") || computer.equalsIgnoreCase("s") && user.equalsIgnoreCase("r")) {
			System.out.println("You won this round!");
			result = "w";
		}
		
		else if (computer.equalsIgnoreCase("r") && user.equalsIgnoreCase("s") || computer.equalsIgnoreCase("p") && user.equalsIgnoreCase("r") || computer.equalsIgnoreCase("s") && user.equalsIgnoreCase("p")) {
			System.out.println("You lost this round!");
			result = "l";
		}		
		return result;
	}


	public static void getStats(String[] moves) {
				
		int length = moves.length;
		
		for (int i = 0; i < length; i++) {
			if (moves[i].equalsIgnoreCase("r")) {
				rockTimes++;
			}
			
			else if (moves[i].equalsIgnoreCase("p")) {
				paperTimes++;
			}
			
			else if (moves[i].equalsIgnoreCase("s")){
				scissorsTimes++;
			}
			
		}
		
		System.out.println("=========================================");
		System.out.println("           GAME STATISTICS");
		System.out.println("=========================================");

		System.out.println("\nRock played: " + rockTimes + " times");
		System.out.println("Paper played: " + paperTimes + " times");
		System.out.println("Scissors played: " + scissorsTimes + " times\n");

	}
	
	
	public static void getWinsLossAndTies(String[] results) {
		
		int length = results.length;
		
		for (int i = 0; i < length; i++) {
			if (results[i].equalsIgnoreCase("w")) {
				winTimes++;
			}
			else if (results[i].equalsIgnoreCase("l")) {
				lossTimes++;
			}
			else if (results[i].equalsIgnoreCase("t")) {
				tieTimes++;
			}
		}
		
		System.out.println("WINS: " +  winTimes);
		System.out.println("LOSSES: " + lossTimes);
		System.out.println("TIES: " + tieTimes);
		
		System.out.println("\nTHANKS FOR PLAYING!");
	}
	
	
	public static void main(String[] args) {
		
		menu();
		
		for (int round = 1; round < 6; round++ ) {
			
			String userMove = getUserMove(round);
			String computerMove = getComputerMove();
			String result = roundStatus(userMove, computerMove);
			
			allUserMoves [round-1] = userMove;
			allResults [round-1] = result;
			
		}

	getStats(allUserMoves);
	getWinsLossAndTies(allResults);
	
	}

}
