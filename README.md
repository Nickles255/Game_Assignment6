# Game_Assignment6

Design a game of Tic Tac Toe - Due date 11/9/2017
Two classes are required for solution.

GameBoard.java - references to 2D array representation of board and all methods to display board, user making move, check for winner,
                 and check if there is a draw.
UML:
    attributes:
          board: char[]
          input: Scanner
    behavior:
        GameBoard(): GameBoard
        displayBoard(): void
        makeAMove(char): void
        isDraw(): boolean
        isWon(char): boolean

TicTacToe.java - driver containing the main string
        displayBoard
        while(keepPlaying)
            makeAMove curr_player
            displayBoard
            if (isWon curr_player)
                 curr_player won
            else if (isDraw)
                 No winner


Task 1: Build Gameboard.java - Due 10/29 (Sunday) KEN DONE!
        Method to create: GameBoard(), displayBoard()

Task 2: Add to Gameboard.java - Due 11/1 (Wednesday)  QD DONE!
        Method to create: makeAMove(), isDraw(), isWon(char)

Task 3: Build TicTacToe.java - Due 11/5 (Sunday) LENA DONE!
        Create logic in main to run processs.

Task 4: Testing process - Due 11/7 (Tuesday) EVERYONE

Task 5: Check and Zip - Due 11/8 (Wednesday)

Submit Zip file - Due 11/9 (Thursday)
