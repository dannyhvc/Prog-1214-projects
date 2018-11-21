package LOOPS;/*
* PURPOSE: shows the use of the continue keyword and its effect on a loop. it will
*          stop the current iteration of the loop and send the control back to LCC (Loop Continuation Condition).
*
* (note) any time that the program says unreachable code, it is a logic error.
* (note) a continue statement stops the current iteration of the loop
 */

public class While_Loop_Continue_Example
{
  public static void main(String[] args)
  {
    //loop counter

    int loopCount = 1;

    //set up INTENTIONAL INFINITE while loop
    while(true)
    {
      System.out.println("\nInside loop body, val of loopCount is " + loopCount);
      loopCount++;

      //setup the exit condition\
      if(loopCount % 4 == 0)
      {
        System.out.println("LoopCount val is " + loopCount +
            " Which is a multiple of 4. Executing the continue to stop this " +
            "iteration of the loop. Going back upstairs to check the LCC.");
        continue;
      }//end if.sa

      //need an EXIT CONDITION
      if(loopCount > 10)
      {
        break;
      }

      System.out.println("This prints if continue is NOT executed.");
    }//end while(1)

    System.out.println("End of program");

  }//end main   
}//end class
