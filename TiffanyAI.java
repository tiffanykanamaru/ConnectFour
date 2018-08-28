import java.util.Random;

public class Tiffany implements CFPlayer {
	// TEMPORARY CHANGE LATER
	int nextMove(CFGame g){
		Random num = new Random();
		int column;
		// Get a random number from 1 to 7
		column = 1+num.nextInt(7);

		return column;
	}

	String getName(){
		return "Tiffany's AI";
	}
}