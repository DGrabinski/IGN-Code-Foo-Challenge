/*
 * Program:     KnightTime
 * 
 * Author:      Daniel Grabinski
 *
 * Description: This program creates a chessboard and allows the user to choose
 *              the starting position of a knight piece.  The program then
 *              calculates each optimal position per move to find the minimal
 *              amount of moves needed to land on each square.  The program ends
 *              by outputting the minimum number of moves needed and the ending
 *              position of the knight piece.
 *
 *
 */

// Imported library 'util' to use the Scanner and InputMismatchException classes
import java.util.*;

public class KnightTime
{

    public static void main(String[] args)
    {
        // Initializes chess board.
        int[][] chessBoard = new int[8][8];
        
        // Array holds info on best position to move on board.
        int[] bestMove = new int[3];

        // Scanner object will be used to recored starting position on knight.
        Scanner input = new Scanner(System.in);

        // Object will find number of moves for theoretical position changes.
        // It will also use a method to graphically show what the chessboard
        // looks like for user input and do some other calculations.
        FindNumMoves  dan = new FindNumMoves();

        // Variables will hold initial position given by the user and next
        // theoretical position.
        int xPos = 0, xPos1 = 0, yPos = 0, yPos1 = 0;

        // Variables will hold number of moves accessible for a position and
        // number of times the knight has moved.
        int numMoves = 0, moveCount = 0;

        
        // For loop sets all the array elements to -1. This will be used to end
        // the program.
        for(int i = 0; i < chessBoard.length; i++)
        {
            for(int j = 0; j < chessBoard[i].length; j++)
            {
                chessBoard[i][j] = -1;
            }
        }

        // This line creates a visual representation of how to input the initial
        // position of the knight.
        dan.CreateChessBoard();

        // Next 2 try and catch blocks are used to make sure user input is a
        // number.
        try
        {
            System.out.print("Enter knight's starting x position: ");
            xPos = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println();
            System.out.println("Sorry, please choose 0-7 as your starting x " +
                "position.  Please try program again.");
            System.exit(0);
        }

        try
        {
            System.out.print("Enter knight's starting y position: ");
            yPos = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println();
            System.out.println("Sorry, please choose 0-7 as your starting y " +
                "position.  Please try program again.");
            System.exit(0);
        }

        // If either user input is not between 0-7, the if statements will
        // display an error message and stop the program.
        if(xPos >= 0 && xPos <= 7)
        {
            if(yPos >= 0 && yPos <= 7)
            {
                // Initial position is marked as used in this line.
                chessBoard[xPos][yPos] = 0;

                // This loop does the calculation for the knight's movement.
                do
                {
                    bestMove[0] = 10;

                    xPos1 = xPos + 1;
                    yPos1 = yPos + 2;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }
                        }
                    
                    }


                    xPos1 = xPos + 1;
                    yPos1 = yPos - 2;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }


                    xPos1 = xPos - 1;
                    yPos1 = yPos + 2;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }


                    xPos1 = xPos - 1;
                    yPos1 = yPos - 2;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }

                    xPos1 = xPos + 2;
                    yPos1 = yPos + 1;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }


                    xPos1 = xPos + 2;
                    yPos1 = yPos - 1;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }


                    xPos1 = xPos - 2;
                    yPos1 = yPos + 1;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }
                

                    xPos1 = xPos - 2;
                    yPos1 = yPos - 1;
                    if (xPos1 >= 0 && xPos1 <= 7 && yPos1 >= 0 && yPos1 <= 7)
                    {
                        if (chessBoard[xPos1][yPos1] == -1)
                        {
                            numMoves = dan.FindNumMoves(chessBoard, xPos1, yPos1);

                            if (numMoves <= bestMove[0])
                            {
                                bestMove[0] = numMoves;
                                bestMove[1] = xPos1;
                                bestMove[2] = yPos1;
                            }

                        }
                    }

                    moveCount += 1;
                    chessBoard[bestMove[1]][bestMove[2]] = 0;
                    xPos = bestMove[1];
                    yPos = bestMove[2];
                    
                }
                while(dan.ChessBoardSum(chessBoard) != 0);
            }
            else
            {
                // Prints error message if initial y value does not fit in
                // boundary.
                System.out.println();
                System.out.println("Sorry, you must choose a number from 0-7 " +
                        "for the y position.  Please try again.");
                System.exit(0);
            }
        }
        else
        {
            // Prints error message if initial x value does not fit in boundary.
            System.out.println();
            System.out.println("Sorry, you must choose a number from 0-7 " +
                    "for the x position.  Please try again.");
            System.exit(0);
        }

        // These lines print the answers for the knight problem.
        System.out.println();
        System.out.println("The minimal amount of moves from this position: " +
                moveCount);
        System.out.println("The knight ended moving on position (" + bestMove[1] +
                ", " + bestMove[2] + ").");
    }

}
