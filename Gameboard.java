/**
    * Gameboard.java represents a gameboard to play tic tac toe as a two dimensional array.
    *  @author(s) Chien Lin, Lena Zheng, Qd Li
    *  @version 1.3
    *  @since 2017-11-06
    *  includes a gameboard initialized with an empty character in each block.
    *  private function to set marker in a location identified by p_row and p_col
    *  public functions displayBoard(), makeAMove(char), isWon(char), isDraw()
*/

import java.util.Scanner;

public class Gameboard { 
    final int bSize = 3;
    final String dashLine = "--------------";
    private char[][] board = new char[bSize][bSize]; 
    private Scanner scan = new Scanner(System.in);

    public Gameboard(){
        for(int row = 0; row < board.length; row++)
        for (int col = 0; col < board[row].length; col++)
            board[row][col] = ' ';
    }

    public void displayBoard(){

        System.out.println(dashLine);
        for(int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print( "| " + board[row][col] + " ");
            }

            System.out.println("| \n" + dashLine);
        }
    };

    // Added setMarker to assist with setting character marking p_mark in p_row, p_col
    // of board
    private void setMarker(int p_row, int p_col, char p_mark){
        board[p_row][p_col] = p_mark;
    };
    // to initiate player to make a move
    public void makeAMove(char player){
        System.out.print("Enter a row for player " + player + ": ");
        int p_row=scan.nextInt();
        System.out.print("Enter a column for player " + player + ": ");
        int p_col=scan.nextInt();
        
        while(board[p_row][p_col] != ' '){
            System.out.println("\nrow is occupied\n");
            
            System.out.print("Enter a row for player" + " " + player + ": ");
            p_row = scan.nextInt();
               
            System.out.print("Enter a column for player" + " " + player + ": ");
            p_col = scan.nextInt();
        }
        setMarker(p_row,p_col,player); 
    }
    //determines a win if there is a three in a row
    public boolean isWon(char player){
        boolean match = false;
        //check for win in a row
        for(int row=0; row<board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                match = true;
            }

            //check for win in a column
            if(board[0][row] == player && board[1][row] == player && board[2][row] == player){
                match = true;
            }
        }

        //check for win diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            match = true;
        }

        if(board[2][0] == player && board[1][1] == player && board[0][2] == player){
            match = true;
        }

        return match;
    }

    public boolean isDraw(){
        //Create a local variable to 
        //represent the current status of cell in the board
        int Space = 0;
        //set a boolean 
        boolean draw = false;
        //loop through the board to check for occupied space
        for(int row=0; row<board.length; row++){
            for(int col=0;col<board[row].length; col++){
                //if a cell in the board is empty
                //Store the information on Space and increment to the next Space
                if(board[row][col] == ' '){
                Space++;
                }
            }
        }
    //if the all space is occupiedboard and there is no winner then it's a draw
        if(Space == 0 && isWon('X') == false && isWon('O') == false){
            draw = true;
        }
        return draw;
    }

}
