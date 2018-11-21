/*
 * Project Name: Array_Copy_Example.java
 * Purpose: shows how to copy the vals from one array to another in case it is important to preserv
 *          the order of the vals in the original array for other purposes.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 10/29/2018 | Time: 1:22 PM
 */

//

package Arrays_Chp6;

public class Array_Copy_Example {
  public static void main(String[] args) {
    //create the original array DIRECT INSTANTIATION
    double[] scoresArray = {10.0, 8.0, 9.0, 6.0};

    //prepare another array to accept the values.
    double[] copiedArray = new double[scoresArray.length];

    for (int i = 0; i < scoresArray.length; i++) {
      copiedArray[i] = scoresArray[i];

    }

    System.out.println("Contents of each array before sorting.");
    //print out contents of each array before sorting the copy.
    for (int i = 0; i < scoresArray.length; i++) {
      System.out.println(scoresArray[i] + ", ");
    }//end for

    for (int i = 0; i < scoresArray.length; i++) {
      System.out.println(copiedArray[i] + ", ");
    }//end for

    System.out.println("Contents of each array after sorting.");

  }//end main()   
}//end Main class
