import java.util.Scanner;
import hw4.CFPlayer;
import hw4.RandomAI;
import hw4.YourNameAI;
import hw4.ConsoleCF;
import hw4.GUICF;

public class Test {
    public static void main(String[] args) {
        CFPlayer ai1 = new JohnAI (); CFPlayer ai2 = new RandomAI (); int n = 10000;
        int winCount = 0;
        for (int i=0; i<n; i++) {
            ConsoleCF game = new ConsoleCF(ai1, ai2); 
            game.playOut();
            if (game.getWinner()==ai1.getName())
                winCount ++; 
        }
        System.out.print(ai1.getName() + " wins "); 
        System.out.print(((double) winCount)/((double) n)*100 + "%"); 
        System.out.print(" of the time.");
    }
}