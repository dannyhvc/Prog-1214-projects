package LOOPS;/*
* PURPOSE: shows how you can terminate a loop by using a break statement inside a condition statement.
*
* (note) any time that the program says unreachable code, it is a logic error.
 */

public class Do_While_Loop_Break_Example
{
  public static void main(String[] args)
  {
    int loopCount = 1;

    //revision here: change to do-while.
    //set up INTENTIONAL INFINITE while loop
    do
    {
      System.out.println("Inside loop body, val of loopCount is " + loopCount);
      loopCount++;

      //setup the exit condition\
      if(loopCount % 10 == 0)
      {
        System.out.println("LoopCount val is " + loopCount +
            " Which is a multiple of 10. Executing the break to exit loop");
        break;
      }//end if.sa

    } while(true); //end do while(1)

    System.out.println("End of program");

  }//end main   
}//end class
