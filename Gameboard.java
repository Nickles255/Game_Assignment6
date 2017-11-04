/**
  * Gameboard.java represents a gameboard to play tic tac toe as a two dimensional array.
  * 
  * 
  *
  *
  *  @author(s) Chien Lin, Lena Zheng, Qd Li
  *  @version 1.1c
  *  @since 2017-11-3
*/

import java.util.Scanner;
import java.util.Arrays;

public class Gameboard { 
    final int bSize = 3;
    final String dashLine = "--------------";
    private char[][] board = new char[bSize][bSize];
    Scanner scan = new Scanner(System.in);

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
    public void setMarker(int p_row, int p_col, char p_mark){
        board[p_row][p_col] = p_mark;
    };

    public void makeAMove(char myMark){
    
        int myRow, myCol;
        System.out.println("Please enter row and column for your move: ");
        
        System.out.print("Row: ");
        myRow = scan.nextInt();
        System.out.print("Column: ");
        myCol = scan.nextInt();

        while(board[myRow][myCol] != ' '){ 
            System.out.println("Row " + myRow + " Column " + myCol + " is already taken!");
            System.out.println("Please enter another location.");
            System.out.print("Row: ");
            myRow = scan.nextInt();
            System.out.print("Column: ");
            myCol = scan.nextInt();
        }

        setMarker(myRow, myCol, myMark); 
    };

    public boolean isWon(char myMark){
            boolean return_value = false;
 
        // Testing vertical and horizontal win situations.
        for(int rc = 0; rc < bSize; rc++){
           
          if(board[rc][0] != ' ' && (board[rc][0] == board[rc][1]) && (board[rc][1] == board[rc][2]))
              return_value = true;  
        
          if(board[0][rc] != ' ' && (board[0][rc] == board[1][rc]) && (board[1][rc] == board[2][rc]))
              return_value = true;
        }

        // Testing two diagonal win situations.
        if(board[0][0] != ' ' && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
           return_value = true;

        if(board[0][2] != ' ' && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
           return_value = true;

          return return_value;
    };

    public boolean isDraw(){
      int num_spaces = 0;
      boolean return_value = false;
      // count number of spaces in the array is blank.
      for(int row = 0; row < bSize; row++){
         for (int col = 0; col < bSize; col++){
            if(board[row][col] == ' ')
                num_spaces++;
         }
      }
      
      if(num_spaces == 0 && isWon('X') == false && isWon('O') == false)
         return_value = true;

     return return_value;
    };
}
