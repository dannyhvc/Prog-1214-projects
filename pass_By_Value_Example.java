/*
 * Project Name: pass_By_Value_Example.java
 * Purpose: shows how primitive valuess are passed by val (photocopy)
 *          The original val in the var will no be altered.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/8/2018 | Time: 2:18 PM
 */
package Methods_Chp6;

public class pass_By_Value_Example {
  public static void main(String[] args) {
    int num1 = 5;
    System.out.println("Val of num1 before it is passed is " + num1);

    //call method
    int returnValue = addFive(num1);
    System.out.println("back in main(), val of returnValue is " + returnValue);
    System.out.println("val of num1 after the method is " + num1);


  }//end main()

  /**
   * Method Name: addFive()
   * Purpose: its a public class method that helps to demonstrate pass by value with
   *          primitive data types.
   * Accepts: int arg
   * Returns: an int val that is args + 5
   * Date: nov 8, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static int addFive(int num1) {
    num1 += 5;
    System.out.println("num1 inside method is " + num1);
    System.out.println("Now returning num1 to main()...");
    return num1;
  }

}//end Main class
