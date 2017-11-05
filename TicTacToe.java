/**
  * Play a game of TicTacToe
  *  @author(s) Chien Lin, Lena Zheng, Qd Li
  *  @version 1.0
  *  @since 2017-11-04
  *  
  */
/**
  * Algorithm:
  * 1) A player makes a move
  * 2) Second player makes a move
  * 3) If either players win, by getting 3 in a row, the game ends
  * 4) If nobody wins and the board is full, it is a tie
 */


public class TicTacToe {
    public static void main(String[] args){
        //player[1] is 'X', player[2]is 'O'
        char[] player = {'X','O'};
        char currentPlayer;
        int turn = 0; //helps to keep track of which player is playing
        boolean keepPlaying = true;
        Gameboard game = new Gameboard();
        game.displayBoard(); //show the board
        
        while (keepPlaying){
            currentPlayer = player[turn % 2]; //if it is an even turn, then player1(X), if odd turn, then player2(O)
            game.makeAMove(currentPlayer); //ask player to make a move
            if (game.isWon(currentPlayer)){
                System.out.println(currentPlayer + " player won.");
                keepPlaying =false;
            }
            else{
                if (game.isDraw()){
                    System.out.println("This game is a draw");
                    keepPlaying =false;
                }
            }
            turn++;
            game.displayBoard(); //show the board
        }
    }
}
