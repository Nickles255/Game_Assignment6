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
    // to initiate player to make a move		
    public void makeAMove(char player){
        System.out.println("Enter a row for player" +" "+ player+":");
        int p_row=scan.nextInt();
        System.out.println("enter a column for player" +" "+ player+":");       
        int p_col=scan.nextInt();
        
     	while(board[p_row][p_col]!=' '){
            System.out.println("row is occupied");
            
            System.out.println("Enter a row for player" +" "+ player+":");
             p_row = scan.nextInt();
               
            System.out.println("enter a column for player" +" "+ player+":");
             p_col = scan.nextInt();
        }
        setMarker(p_row,p_col,player); 
    }
    //determines a win if there is a three in a row
    public boolean isWon(char player){
        boolean match = false;
	//check for win in a row    
        for(int row=0; row<board.length;row++){
            if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                match=true;
            }
	    //check for win in a column	
            if(board[0][row]==player&&board[1][row]==player&&board[2][row]==player){
                match=true;
            }
              
        }
 	   //check for win diagonal		     
           if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
               match=true;
           }
           if(board[2][0]==player&&board[1][1]==player&&board[0][2]==player){
               match=true;
           }
       
         return match;
    }
    //The method to determine if its a draw or not   
    public  boolean isDraw(){
        boolean draw = false;
        for(int row = 0; row<board.length;row++){
            for(int col = 0;col<board[row].length;col++){
		//if the row and column not empty and there is no winner, there is a draw
                if(board[row][col]!=' '&&isWon('x')==draw&&isWon('o')){
                   draw= true;               
                }
            }
        }
        return draw;
    }


}
