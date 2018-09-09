import java.util.Random;

public class TiffanyAI implements CFPlayer {
	public int nextMove(CFGame g){
		int[][] board = g.getState();

		// Call random move
		RandomAI randomMove = new RandomAI();
		return randomMove.nextMove(g);
	}

	public String getName(){
		return "Tiffany's AI";
	}
}