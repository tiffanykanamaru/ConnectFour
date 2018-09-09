import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GUICF extends CFGame {

	// Represents graphics for 6x7 board
	private GameBoard this_board;

	// Sets up & starts a human vs. AI Game
	public GUICF(CFPlayer ai){
		
	}

	// Sets up AI vs. AI game
	public GUICF(CFPlayer ai1, CFPlayer ai2){
		// Get random number
		Random num = new Random();
		int first = num.nextInt(2);


	}

	// private boolean playGUI(int c)
	private class GameBoard extends javax.swing.JPanel {
		// Initialize empty board
		private GameBoard(){
			// Create frame
        	JFrame frame = new JFrame ("Connect Four");
	        frame.setVisible(true);
	        frame.setSize(700,600);
	        frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Set grid layout
	        GridLayout gameLayout = new GridLayout(6,7);

	        // Create panel object
	        JPanel panel = new JPanel();
	        panel.setLayout(gameLayout);

	        // Array of JLabel
	        JLabel labels[] = new JLabel[42];

	        // Add labels onto panel
	        for (int i = 0; i<42; i++){
	            labels[i] = new JLabel();
	            labels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            panel.add(labels[i]);
	        }

	        // Add panel to the frame
	        frame.add(panel);
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