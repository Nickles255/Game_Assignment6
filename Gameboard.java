/**
  * Gameboard.java represents a gameboard to play tic tac toe as a two dimensional array.
  * 
  * 
  *
  *
  *  @author(s) Chien Lin, Lena Zheng, Qd Li
  *  @version 1.0
  *  @since 2017-10-27 
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

}
