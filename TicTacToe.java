/**
    * Play a game of TicTacToe
    *  @author(s) Chien Lin, Lena Zheng, Qd Li
    *  @version 1.0
    *  @since 2017-11-06 
    *  
*/
/**
    * Algorithm:
    * 1) A player makes a move
    * 2) Second player makes a move
    * 3) If either players win, by getting 3 in a row, the game ends
    * 4) If nobody wins and the board is full, it is a tie and the game ends
*/


/**
    * Driver program to play TicTacToe using Gameboard
    * Each player 'X' and 'O' takes a turn until someone
    * gets 3 in a row.
    * if the board is filled up and nobody has won, the game
    * is a draw.
*/
public class TicTacToe {
    public static void main(String[] args){
        //player[1] is 'X', player[2] is 'O'
        char[] player = {'X','O'};
        char currentPlayer;

        //helps to keep track of whose turn it is
        int turn = 0;
        
        //checker to see if the game should continue
        boolean keepPlaying = true;
        Gameboard game = new Gameboard();
        
        
        while (keepPlaying){
            //show the board
            game.displayBoard();
            System.out.println();
            //if it is an even turn, then player0 (X), if odd turn, then player1 (O)
            currentPlayer = player[turn % 2];
        
            //ask player to make a move
            game.makeAMove(currentPlayer);
            System.out.println();
        
            // if the player won, display the winner and end the game
            if (game.isWon(currentPlayer)){
                //show the board
                game.displayBoard();
                System.out.println("\n" + currentPlayer + " player won.");
                keepPlaying =false;
            }
            else{

                // if the it is a draw, display the draw and end the game
                if (game.isDraw()){
                    //show the board
                    game.displayBoard();
                    System.out.println("\nThis game is a draw");
                    keepPlaying =false;
                }
            }

            // keep track of the turn
            turn++;
        }
    }
}
