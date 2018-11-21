package LOOPS;/*
* PURPOSE: shows how you can terminate a loop by using a break statement inside a condition statement.
*
* (note) any time that the program says unreachable code, it is a logic error.
 */

public class While_Loop_Break_Example
{
  public static void main(String[] args)
  {
    //loop counter

    int loopCount = 1;

    //set up INTENTIONAL INFINITE while loop
    while(true)
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

    }//end while(1)

    /*
     * EXAMPLE OF AN INFINITE FOR LOOP. this is often seen in Cpp code, but rarely
     * seen in java code.
     */
    int i=1;
    for(;;)
    {
      i++;
      System.out.println("Inside infinite for loop, val of 'i' is " + i);
      if(i > 5)
      {
        System.out.println("Val of 'i' is " + i + " exec break...");
        break;
      }//end if
    }//end inf f-loop.

    System.out.println("End of program");
  }//end main   
}//end class
