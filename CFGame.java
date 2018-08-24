package hw4;

public class CFGame {

    private final int[][] state;
    private boolean isRedTurn;
    private boolean isDraw;

    // Array initializer
    {
        state = new int[7][6];
        for (int i=0; i<7; i++)
            for (int j=0; j<6; j++)
                state[i][j] = 0;
        isRedTurn = true; 
        isDraw = false;
    }
    
  // Gets current state of the game
    public int[][] getState() {
        int[][] ret_arr = new int[7][6];
        for (int i=0; i<7; i++)
            for (int j=0; j<6; j++)
                ret_arr[i][j] = state[i][j];
        return ret_arr;
    }
  
  // Returns if it is the red turn or not
    public boolean isRedTurn() {
        return isRedTurn;
    }

    // Plays column c
    // If c canoot be played b/c it is full or invalid --> return false
    // Otherwise return true
    // Column ranges from 1 to 7
    public boolean play (int c){
        for (int i=0; i<7; i++){
            for (int j = 0; j<6; j++){

            }
        }

    }

  
}
