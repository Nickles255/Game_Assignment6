import java.util.Scanner;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qdong
 */
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
    
    public boolean isWon(char player){
        if(board[0][0]==player//first row matches
                &&board[0][1]==player
                &&board[0][2]==player
             ||board[1][0]==player//second row matches
                &&board[1][1]==player
                &&board[1][2]==player   
             ||board[2][0]==player//third row matches
                &&board[2][1]==player
                &&board[2][2]==player
             //if all three values matches diagonal   
             ||board[0][0]==player
                &&board[1][1]==player
                &&board[2][2]==player
             //if all three values matches diagonal backwards   
             ||board[0][2]==player
                &&board[1][1]==player
                &&board[2][0]==player){
            return true;
        }
        return false;
    }
       
    public  boolean isDraw(){
        for(int row=0; row<board.length; ++row){
            for(int col=0;col<board[row].length; col++){
                if(board[row][col]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}
