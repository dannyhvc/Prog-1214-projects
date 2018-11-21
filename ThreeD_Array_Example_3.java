/*
 * Project Name: ThreeD_Array_Example_1.java
 * Purpose: shows the creation of a 3D array.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/1/2018 | Time: 2:19 PM
 */

package Arrays_Chp6;

public class ThreeD_Array_Example_3 {
  public static void main(String[] args) {

    // constants for number of rows and columns
    final int NUM_ROWS = 3;
    final int NUM_COL = 6;
    final int Num_PAGES = 2;

    //create the table array
    int[][][] bookArray = new int[NUM_ROWS][NUM_COL][Num_PAGES];

    // set up a NESTED FOR LOOP to cycle through and column and populate it with
    // random vals from 1-49 for the lotto 649 draw

    for (int pageNum = 0; pageNum < bookArray.length; pageNum++) {
      //outer loop cycle through the rows
      for (int rowNum = 0; rowNum < bookArray[pageNum].length; rowNum++) {
        //INNER loop here: it cycles each column val
        for (int colNum = 0; colNum < bookArray[pageNum][rowNum].length; colNum++) {
          bookArray[pageNum][rowNum][colNum] = (int) (Math.random() * 49 + 1);
        }//end for inner
      }//end for outter
    }

    for (int pageNum = 0; pageNum < bookArray.length; pageNum++) {
      //outer loop cycle through the rows
      for (int rowNum = 0; rowNum < bookArray[pageNum].length; rowNum++) {
        //INNER loop here: it cycles each column val
        for (int colNum = 0; colNum < bookArray[pageNum][rowNum].length; colNum++) {
          System.out.print(bookArray[pageNum][rowNum][colNum] + ",");
        }//end for inner
        System.out.println();  // just for spacing
      }//end for outter
      System.out.println();
    }//end for super outter

  }//end main()
}//end Main class
