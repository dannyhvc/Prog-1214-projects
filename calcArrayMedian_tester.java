/*
 * Project Name: calcArrayMedian_tester.java
 * Purpose: tests the calcArrayMedian() method in my toolbox class
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/14/2018 | Time: 3:13 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

public class calcArrayMedian_tester {
  public static void main(String[] args) {
    int[] array1 = {8, 2, 6, 1};
    int[] array2 = {8, 2, 6, 1, 10};
    String[] baanArray = {"john", "Paul", "George", "Ringo"};

    double array_median = MyToolbox.calcArrayMedian(array1);


    System.out.print("Values in int array1 are: ");
    MyToolbox.printArrayContents(array1);
    System.out.print("\nMedian Values of array1 is: " + array_median);

    array_median = MyToolbox.calcArrayMedian(array2);
    System.out.println("\n Values in arra2: ");
    MyToolbox.printArrayContents(array2);
    MyToolbox.printArrayContents(array2);

    /////
    String nameCatcher = MyToolbox.calcArrayMedian(baanArray);
    System.out.println("Vals in bandArray are: ");
    MyToolbox.printArrayContents(baanArray);
    System.out.println("Median of bannArray is " + nameCatcher);


  }//end main()
}//end Main class
