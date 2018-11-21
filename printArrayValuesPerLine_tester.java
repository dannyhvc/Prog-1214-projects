/*
 * Project Name: printArrayValuesPerLine_tester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/12/2018 | Time: 12:18 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

public class printArrayValuesPerLine_tester {
  public static void main(String[] args) {
    //test array
    int[] intArray = new int[25];
    double[] doubleArray = new double[25];

    //populate it with vlaes from 1 - 25
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 1;
    }//end for

    //populate it with vlaes from 1 - 25
    for (int i = 0; i < doubleArray.length; i++) {
      doubleArray[i] = i + 1;
    }//end for

    System.out.println();
    MyToolbox.printArrayContents(intArray, 25);
    MyToolbox.printArrayContents(doubleArray, 25);
  }//end main()   
}//end Main class
