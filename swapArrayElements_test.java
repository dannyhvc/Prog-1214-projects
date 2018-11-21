/*
 * Project Name: swapArrayElements_test.java
 * Purpose: test the swapArrayElements in MyToolbox
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/19/2018 | Time: 12:20 PM
 */
package Methods_Chp6;

public class swapArrayElements_test
{
  public static void main(String[] args)
  {
    //test array
    int[] testArray = {1,2,3,4,5};
    System.out.println("Order of elements in testArray before the swap is: ");
    MyToolbox.printArrayContents(testArray);

    System.out.println("\n Now swapping first and last values in the array...");
    MyToolbox.swapArrayElements(testArray, 0,testArray.length - 1);

    System.out.println("\nOrder of elements in testArray after the swap is: ");
    MyToolbox.printArrayContents(testArray);
  }//end main()   
}//end Main class
