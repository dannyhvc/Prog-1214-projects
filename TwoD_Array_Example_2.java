/*
 * Project Name: TwoD_Array_Example_1.java
 * Purpose: shows the use of a nest for loop structure to populate and travers the array.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/1/2018 | Time: 2:19 PM
 */

//

package Arrays_Chp6;

public class TwoD_Array_Example_2 {
  public static void main(String[] args) {

    // constants for number of rows and columns
    final int NUM_ROWS = 3;
    final int NUM_COL = 6;

    //create the table array
    int[][] tableArray = new int[NUM_ROWS][NUM_COL];

    // set up a NESTED FOR LOOP to cycle through and column and populate it with
    // random vals from 1-49 for the lotto 649 draw

    //outer loop cycle through the rows
    for (int rowNum = 0; rowNum < tableArray.length; rowNum++) {
      //INNER loop here: it cycles each column val
      for (int colNum = 0; colNum < tableArray[rowNum].length; colNum++) {
        tableArray[rowNum][colNum] = (int)(Math.random() * 49 + 1);
      }//end for inner
    }//end for outter

    //lets run anotehr NESTED FOR LOOP and print out the contents of the table
    System.out.println("Vals in the tableArray are: \n");

    for (int rowNum = 0; rowNum < tableArray.length; rowNum++) {
      //INNER loop here: it cycles each column val
      for (int colNum = 0; colNum < tableArray[rowNum].length; colNum++) {
        System.out.print(tableArray[rowNum][colNum] + ",");
      }//end for inner
    }//end for outter





  }//end main()   
}//end Main class
