import java.util.Random;
import java.util.Scanner;

public class ConsoleCF extends CFGame{
	CFPlayer playerOne;
	CFPlayer playerTwo;

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

	private class HumanPlayer implements CFPlayer {
		int nextMove(CFGame g){
			do {
				Scanner userColumn = new Scanner(System.in);
				System.out.println("What is the next move?: ");
				int column = userColumn.nextInt();
			} while (g.play(column) == false);
		}

		String getName(){
			return "Human Player";
		}
	}
}