/*
 * Project Name: reverseArrayElements_tester.java
 * Purpose: tests the reverseArrayElements() and the reverseArrayElementsVersion2 in Mytoolbox class.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/19/2018 | Time: 12:36 PM
 */
package Methods_Chp6;

public class reverseArrayElements_tester
{
  public static void main(String[] args)
  {
    //test array
    int[] testArray = {1,2,3,4,5};
    System.out.println("Order of values in testArray before reversal is: ");
    MyToolbox.printArrayContents(testArray);

    System.out.println("Now reversing the elements: ");
    //CATCH the returned array in a variable
    int[] returnedArray = MyToolbox.reverseArrayElements(testArray);

    System.out.println("Order of values in returnedArray after reversal is: ");
    MyToolbox.printArrayContents(returnedArray);

    System.out.println("\n note testing version2 of the method on the returnedArray");
    System.out.println("(NOTE) version2 works on the real McCoy.");
    MyToolbox.reverseArrayElementsVersion2(returnedArray);
    System.out.println("Order of values in returnedArray after reversal is using version 2 is : ");
    MyToolbox.printArrayContents(returnedArray);
  }//end main()   
}//end Main class
