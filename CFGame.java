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
    public boolean play (int c){
        // Check if columns are within bounds
        if (c > 7 || c < 1){
            return false;
        }

        // Check if there is an empty space in column c
        for (int j=0; j<6; j++){
            if (state[c-1][j] == 0){
                if (isRedTurn == true){
                    state[c-1][j] = 1;
                    return true;
                }
                else {
                    state[c-1][j] = -1;
                    return true;
                    break;
                }
            }
        }
        return false;
    }

    // Sees if game is over or not
    public boolean isGameOver(){

        // Checks horizontal case
        for (int i=0; i<6; i++){
            for (int j=0; j<4; j++){
                if (state[i][j] == state[i][j+1] == state[i][j+2] == state[i][j+3]){
                    return true;
                }
            }
        }

        // Checks vertical case
        for (int j=0; j<6; j++){
            for (int i=0; i<3; i++){
               if (state[i][j] == state[i+1][j] == state[i+2][j] == state[i+3][j]){
                return true;`
               } 
            }
        }

        // Check upward diagnoal

        // Check downward diagonal

    }


}
