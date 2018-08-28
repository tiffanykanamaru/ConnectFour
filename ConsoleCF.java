import java.util.Random;
import java.util.Scanner;

public class ConsoleCF extends CFGame{
	CFPlayer playerOne;
	CFPlayer playerTwo;

	// Sets up human vs AI game
	public ConsoleCF(CFPlayer ai){
		// Create human player object
		HumanPlayer hPlayer = new HumanPlayer();

		// Get random number (0 or 1)
		Random num = new Random();
		int first = num.nextInt(2);

		// Determine which players goes first
		if (first == 0){
			playerOne = ai;
			playerTwo = hPlayer;
		} else {
			playerOne = hPlayer;
			playerTwo = ai;
		}
	}

	// Sets up AI vs AI game
	public ConsoleCF(CFPlayer ai1, CFPlayer ai2){
		// Get random number (0 or 1)
		Random num = new Random();
		int first = num.nextInt(2);

		// Determine which player goes first 
		if (first == 0){
			playerOne = ai1;
			playerTwo = ai2;
		}
		else {
			playerOne = ai2;
			playerTwo = ai1;
		}
	}

	// Human player implementation
	private class HumanPlayer implements CFPlayer {
		int nextMove(CFGame g){
			// Print out current board
			int[][] currentBoard = g.getState();
			for (int i=0; i<7; i++){
				for (int j=0; j<6; j++){
					System.out.print(currentBoard[i] + " " + currentBoard[j] + " ");
					System.out.println();
				}
			}

			// Ask for user input
			do {
				Scanner userColumn = new Scanner(System.in);
				System.out.println("What is the next move?: ");
				int column = userColumn.nextInt();
			} while (column>=8 && column<=0);
		}

		String getName(){
			return "Human Player";
		}
	}
}