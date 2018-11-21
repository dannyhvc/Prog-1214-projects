/*
 * Project Name: Pass_By_Reference_Example.java
 * Purpose: shows how obj type such as arrays are passed by reference. The memory address
 *          (the reference) of the obj is passed into the method, so the
 *          method works on the REAL McCOY.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/8/2018 | Time: 2:27 PM
 */
package Methods_Chp6;
import Methods_Chp6.MyToolbox;

public class Pass_By_Reference_Example {
  public static void main(String[] args) {
    //array for test
    int[] testArray = {10,4,78,4,45};
    System.out.println("values in testArray befor sorting are: ");
    MyToolbox.printArrayContents(testArray);

    //array for test
    int[] a = {10,4,78,4,45};
    System.out.println("values in testArray befor sorting are: ");
    MyToolbox.printArrayContents(testArray);





  }//end main()   
}//end Main class
