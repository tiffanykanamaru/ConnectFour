import java.util.Random;

public class ConsoleCF extends CFGame{
	CFPlayer playerOne;
	CFPlayer playerTwo;

	// Sets up AI vs AI game
	public ConsoleCF(CFPlayer ai1, CFPlayer ai2){
		// Get random number (0 or 1)
		Random num = new Random();
		int first = num.nextInt(2);

		if (first == 0){
			playerOne = ai1;
			playerTwo = ai2;
		}
		else {
			playerOne = ai2;
			playerTwo = ai1;
		}

	}
}