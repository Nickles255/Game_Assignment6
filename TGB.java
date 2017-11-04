/**
  * TGB test the functionaly of gameboard class
  *  @author(s) Chien Lin, Lena Zheng, Qd Li
  *  @version 1.0
  *  @since 2017-10-27
  *  General testing of the Gameboard class to confirm it is working for Phase 3.
  */
/**
  * Algorithm:
 */


public class TGB {
    public static void main(String[] args){
    char player1 = 'X', player2 = 'O';
/*System.out.println("------- Testing for Phase 1 Initialize Gameboard--------\n");
// create and display gameboard
    Gameboard myGame_p1 = new Gameboard();
    myGame_p1.displayBoard();
    
    System.out.println("\nTesting setMarker function to place an X in top left position");
    System.out.println("and an O in bottom right position\n"); 
    myGame_p1.setMarker(0, 0, 'X');
    myGame_p1.setMarker(2, 2, 'O');
    myGame_p1.displayBoard();
    
*/
System.out.println("\n------- Testing for Phase 2 Methods in Gameboard--------\n");
// tesing methods in game board.
    
    Gameboard myGame_p2 = new Gameboard();
/*	System.out.println("Testing makeAMove for player1 and player 2\n");
    myGame_p2.makeAMove(player1);
    myGame_p2.displayBoard();
   
    myGame_p2.makeAMove(player2);
    myGame_p2.displayBoard();*/

 //   System.out.println("\nTesting isWon for X \n");
 //   System.out.println(myGame_p2.isWon(player1));

	System.out.println("\n");
    myGame_p2.setMarker(0, 0, 'X');
    myGame_p2.setMarker(0, 1, 'X');
    myGame_p2.setMarker(0, 2, 'X');
    myGame_p2.setMarker(1, 0, 'X');
    myGame_p2.setMarker(1, 1, 'X');
    myGame_p2.setMarker(1, 2, 'X');
    myGame_p2.setMarker(2, 0, 'X');
    myGame_p2.setMarker(2, 1, 'X');
    myGame_p2.setMarker(2, 2, 'X');
   
    myGame_p2.displayBoard();
	System.out.println("\nTesting isDraw for draw situation.\n");
    System.out.println(myGame_p2.isDraw());
    
    System.out.println("\nTesting isWon for X \n");
    System.out.println(myGame_p2.isWon(player1));
    
	System.out.println("\n");
    myGame_p2.setMarker(0, 0, 'O');
    myGame_p2.setMarker(0, 1, 'O');
    myGame_p2.setMarker(0, 2, 'X');
    myGame_p2.setMarker(1, 0, 'X');
    myGame_p2.setMarker(1, 1, 'O');
    myGame_p2.setMarker(1, 2, 'O');
    myGame_p2.setMarker(2, 0, 'O');
    myGame_p2.setMarker(2, 1, 'X');
    myGame_p2.setMarker(2, 2, 'X');
   
    myGame_p2.displayBoard();
	System.out.println("\nTesting isDraw for draw situation.\n");
    System.out.println(myGame_p2.isDraw());
    
    System.out.println("\nTesting isWon for X \n");
    System.out.println(myGame_p2.isWon(player1));

    
	System.out.println("\n");
    myGame_p2.setMarker(0, 0, ' ');
    myGame_p2.setMarker(0, 1, ' ');
    myGame_p2.setMarker(0, 2, ' ');
    myGame_p2.setMarker(1, 0, ' ');
    myGame_p2.setMarker(1, 1, ' ');
    myGame_p2.setMarker(1, 2, 'O');
    myGame_p2.setMarker(2, 0, 'O');
    myGame_p2.setMarker(2, 1, 'X');
    myGame_p2.setMarker(2, 2, 'X');
   
    myGame_p2.displayBoard();
	System.out.println("\nTesting isDraw for draw situation.\n");
    System.out.println(myGame_p2.isDraw());
    
    System.out.println("\nTesting isWon for X \n");
    System.out.println(myGame_p2.isWon(player1));
	
	System.out.println("\n");
    myGame_p2.setMarker(0, 0, ' ');
    myGame_p2.setMarker(0, 1, 'O');
    myGame_p2.setMarker(0, 2, 'O');
    myGame_p2.setMarker(1, 0, ' ');
    myGame_p2.setMarker(1, 1, ' ');
    myGame_p2.setMarker(1, 2, 'O');
    myGame_p2.setMarker(2, 0, 'X');
    myGame_p2.setMarker(2, 1, 'X');
    myGame_p2.setMarker(2, 2, 'X');
   
    myGame_p2.displayBoard();
	System.out.println("\nTesting isDraw for draw situation.\n");
    System.out.println(myGame_p2.isDraw());
    
    System.out.println("\nTesting isWon for X \n");
    System.out.println(myGame_p2.isWon(player1));
    }
}
