package LOOPS; /**
 * PURPOSE: shows the basic set up for a FOR loop, pre-TEST type of loop
 *          thiat is most usually found in DETERMINATE loop situations
 */
import java.util.Scanner;

public class Basic_For_Loop_Example
{
  public static void main(String[] args)
  {
    //create scanner
    Scanner in = new Scanner(System.in);

    //prompt use for a number from 1-10
    System.out.println("Enter a number from 1-10 for # of loop iterations: ");
    int numIter = in.nextInt();

    //set up for loop and use the user input in the LCC
    for(int i=0; i <= numIter; i++) //NEVER EVER EVER PUT A SEMICOLON HERE
    {
      System.out.println("Inside loop body, loop counter 'i' is " + i);
    }//end f-loop

    //shows the end of the iteration.
    System.out.println("Past the loop.");

    in.close();

  }//end main   
}//end class
