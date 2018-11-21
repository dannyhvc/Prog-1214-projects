/*
 * Project Name: CopyArray_Tester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/12/2018 | Time: 1:40 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

import java.util.Arrays;

public class CopyArray_Tester {
  public static void main(String[] args) {
    int[] intArray = {5, 2, 8, 4, 1};
    System.out.println("Contents of int array are: ");
    MyToolbox.printArrayContents(intArray);

    //copy it
    int[] copiedArr = MyToolbox.copyArray(intArray);
    System.out.println("\nContents of copied array are: ");
    MyToolbox.printArrayContents(copiedArr);

    //cort copy
    Arrays.sort(copiedArr);
    System.out.println("\nContents of copiedArr after sorting are: ");
    MyToolbox.printArrayContents(copiedArr);

    //NOW....
    // teachable moment
    //problem with trying to use the assignment opp to copy an array from one var to another.
    int[] array2 = {3, 2, 1};
    System.out.println("\nContents of Array2: ");
    MyToolbox.printArrayContents(array2);

    int[] copiedArray2 = array2; // is redundant because it is pointing to the same memory address
    // basically working on the real McCoy.
  }//end main()   
}//end Main class
