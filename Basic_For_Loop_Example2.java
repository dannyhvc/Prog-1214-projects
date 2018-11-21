package LOOPS; /**
 * PURPOSE: shows the basic set up for a FOR loop, pre-TEST type of loop
 *          thiat is most usually found in DETERMINATE loop situations
 *
 *          revision: in this version we declare the loop counter var in the scope of the main method. this way,
 *                    it stays visible AFTER the loop has been terminated.
 */
import java.util.Scanner;

public class Basic_For_Loop_Example2
{
  public static void main(String[] args)
  {
    //create scanner
    Scanner in = new Scanner(System.in);
    //prompt use for a number from 1-10
    System.out.println("Enter a number from 1-10 for # of loop iterations: ");
    int numIter = in.nextInt();

    //revision HERE: declare 'i' in main method scope.
    int i;
    //set up for loop and use the user input in the LCC
    //revision: must remove data type 'int' before the the 'i'
    for(i=0; i <= numIter; i++) //NEVER EVER EVER PUT A SEMICOLON HERE
    {
      System.out.println("Inside loop body, loop counter 'i' is " + i);
    }//end f-loop1

    System.out.println("\nNow doing a count down Loop.");
    for(i = numIter; i > 0; i--)
    {
      System.out.println("Inside loop body, loop counter 'i' is " + i);
    }//end f-loop2.

    //shows the end of the iteration.
    System.out.println("Past the loop.");

    in.close();

  }//end main   
}//end class
