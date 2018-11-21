/*
 * Project Name: Raged_Array_Example_1.java
 * Purpose: shows the creation of a ragged array using the direct instantiation approach.
 *          this means that we DO NOT use the 'new' keyword  when we build the array
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/5/2018 | Time: 12:15 PM
 */
package Arrays_Chp6;

public class Raged_Array_Example_1 {
  public static void main(String[] args) {

    int[][] raggedArray = {
        {6,38,34,49,40},
        {2,99},
        {1,17,99},
        {67}
    };  // end raggedArray

    //print out the vals on each line using a NESTED for loop.
    //outter loop cycles throught the rows
    for (int rowNum = 0; rowNum < raggedArray.length; rowNum++) {
      //inner loop cycles throught the cols.
      for (int colNum = 0; colNum < raggedArray[rowNum].length; colNum++) {
        System.out.print(raggedArray[rowNum][colNum] + "\t");
      }  // end inner for
      System.out.println();  // used to enter down to the next row. used fo spacing.
    }  // end outter for

  }//end main()   
}//end Main class
