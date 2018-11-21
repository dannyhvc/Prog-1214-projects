/*
 * Project Name: Raged_Array_Example_3.java
 * Purpose: shows the creation of a ragged array using the direct instantiation approach.
 *          what we do here is make a 2d array but leave the last value as null.
 *
 *          (REVISION) here we generate random vals for the num of elements
 *                     to be placed .
 *
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/5/2018 | Time: 12:15 PM
 */
package Arrays_Chp6;
import java.util.Random;

public class Raged_Array_Example_3 {
  public static void main(String[] args) {

    // build the raggedArray using the new op, leave the square brackets
    // for the number of cols.
    int[][] raggedArray = new  int[4][];

    // (revision)
    // lets fill these using a random number object to generate random vals.
    Random rdmGenerator = new Random();

    // generate
    for (int rowNum = 0; rowNum < raggedArray.length; rowNum++) {
      raggedArray[rowNum] = new int[rdmGenerator.nextInt(10) + 1];  // upper = 10, lower = 1
    }

    // populates the array
    for (int rowNum = 0; rowNum < raggedArray.length; rowNum++) {
      for (int colNum = 0; colNum < raggedArray[rowNum].length; colNum++) {
        raggedArray [rowNum][colNum] = rdmGenerator.nextInt(50);
      }
    }

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
