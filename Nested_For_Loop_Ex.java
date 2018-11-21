package LOOPS;/*
 * Purpose: shows how loops can be nested inside each other.
 */

public class Nested_For_Loop_Ex
{
  public static void main(String[] args)
  {
    //set up an outer for loop to run 3 times.
    for(int i=1; i <= 3; i++)
    {
      System.out.println("\ninside outer loop body, val of 'i' is " + i);

      //setup the inner loop
      for(int j = 1; j < 4; j++)
      {
        System.out.println("\tinside inner loop body, val of 'j' is " + j);
      }//end inner loop.
    }//end outer loop

  }//end main   
}//end class
