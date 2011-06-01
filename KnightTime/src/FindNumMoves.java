/*
 * Program:     FindNumMoves
 *
 * Author:      Daniel Grabinski
 *
 * Description: This program does the calculations for finding the amount of
 *              possible moves accessible to a position on a chess board. It
 *              also has methods to find the number of squares still unused
 *              on the board and to display a graphical representation of the
 *              chess board to the user.
 *
 * Methods:     FindNumMoves()
 *              ChessBoardSum()
 *              CreateChessBoard()
 *
 */

public class FindNumMoves
{
    int numOfMoves = 0, chessBoardSum = 0;

    int xNextPos1 = 0, yNextPos1 = 0;

    // Method finds theoretical number of moves a position has and returns its
    // integer value.
    public int FindNumMoves(int chessBoard[][], int xPosition, int yPosition)
    {
        numOfMoves = 0;

        xNextPos1 = xPosition + 1;
        yNextPos1 = yPosition + 2;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition + 1;
        yNextPos1 = yPosition - 2;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition - 1;
        yNextPos1 = yPosition + 2;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition - 1;
        yNextPos1 = yPosition - 2;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition + 2;
        yNextPos1 = yPosition + 1;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition + 2;
        yNextPos1 = yPosition - 1;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition - 2;
        yNextPos1 = yPosition + 1;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        xNextPos1 = xPosition - 2;
        yNextPos1 = yPosition - 1;
        if (xNextPos1 >= 0 && xNextPos1 <= 7 && yNextPos1 >= 0 && yNextPos1 <= 7)
        {
            if (chessBoard[xNextPos1][yNextPos1] == -1)
            {
                numOfMoves += 1;
            }
        }

        return numOfMoves;

    }

    // When called, method will return number of positions open on board.
    public int ChessBoardSum(int chessBoard[][])
    {
        chessBoardSum = 0;
        
        for(int i = 0; i < chessBoard.length; i++)
        {
            for(int j = 0; j < chessBoard[i].length; j++)
            {
                chessBoardSum += chessBoard[i][j];
            }
        }
        
        return chessBoardSum;
    }

    // Method creates visual representation of chess board.
    public void CreateChessBoard()
    {
        System.out.println("              x         ");
        System.out.println();
        System.out.println("        0 1 2 3 4 5 6 7 ");
        System.out.println("        _ _ _ _ _ _ _ _ ");
        System.out.println("    0  |_|_|_|_|_|_|_|_|");
        System.out.println("    1  |_|_|_|_|_|_|_|_|");
        System.out.println("    2  |_|_|_|_|_|_|_|_|");
        System.out.println("y   3  |_|_|_|_|_|_|_|_|");
        System.out.println("    4  |_|_|_|_|_|_|_|_|");
        System.out.println("    5  |_|_|_|_|_|_|_|_|");
        System.out.println("    6  |_|_|_|_|_|_|_|_|");
        System.out.println("    7  |_|_|_|_|_|_|_|_|");
        System.out.println();
        System.out.println();
    }


}
