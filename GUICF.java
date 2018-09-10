import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GUICF extends CFGame {
	// Represents graphics for 6x7 board
	private GameBoard this_board;


	CFPlayer playerOne;
	CFPlayer playerTwo;

	private JFrame frame;
	private JPanel panel;

	// Sets up & starts a human vs. AI Game
	public GUICF(CFPlayer ai){
		// Create human player object
		HumanPlayer hPlayer = new HumanPlayer();

		// Decide which player goes first
		Random num = new Random();
		int first = num.nextInt(2);

		if (first == 0){
			playerOne = ai;
			playerTwo = hPlayer;
		}
		else {
			playerOne = hPlayer;
			playerTwo = ai;
		}

		// Set up button
		JPanel buttonLayout = new JPanel();
		JButton button = new JButton("Play");
		frame.add(button, BorderLayout.NORTH);
	}

	// Sets up AI vs. AI game
	public GUICF(CFPlayer ai1, CFPlayer ai2){
		// Get random number
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

	// Plays column c
	private boolean playGUI(int c){
		// if column is out of bounds, return false
		if (c > 7 || c < 1){
			return false;
		}

	}

	// private boolean playGUI(int c)
	private class GameBoard extends javax.swing.JPanel {
		// Initialize empty board
		private GameBoard(){
			// Create frame
        	frame = new JFrame ("Connect Four");
	        frame.setVisible(true);
	        frame.setSize(700,600);
	        frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());

	        // Set grid layout
	        GridLayout gameLayout = new GridLayout(6,7);

	        // Create panel object
	        panel = new JPanel();
	        panel.setLayout(gameLayout);

	        // Array of JLabel
	        JLabel labels[] = new JLabel[42];
	        for (int i = 0; i<42; i++){
	            labels[i] = new JLabel();
	            labels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            panel.add(labels[i]);
	            // set opaque
	            labels.setOpaque(true);
	        }

	        // Add panel to the frame
	        frame.add(panel, BorderLayout.CENTER);
		}

		// Paints specific coordinate red or black
		private void paint(int x, int y, int color){
			// set color to red
			if (color == 1){
				g.setColor(Color.red);
				// TODO: change width+height
				g.fillRect(x, y, 50, 50);
			}
			else {
				g.setColor(Color.black);
				// TODO: change width+height
				g.fillRect(x, y, 50, 50);
			}
		}
	}


}