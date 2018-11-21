/**
 * Project Name: Basic_Methods_Example_1.java
 * Purpose: shows the creation of a STATIC METHOD that will accept two ints
 *          vals and return their sum.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/5/2018 | Time: 1:43 PM
 */
package Methods_Chp6;
import java.util.Scanner;

public class Basic_Methods_Example_1 {
  public static void main(String[] args) {
    //input sections.
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int numberOne = in.nextInt();
    System.out.println("Enter your second number: ");
    int numberTwo = in.nextInt();
    in.close();

    addTwoInts(numberOne, numberTwo);

  }//end main()

  /**
   * Method name: addTwoInts
   * purpose: a public class method that will add 2 int vals and return the some.
   * Accepts: 2 ints to be added.
   * returns: an in value that is the sum of the 2 args.
   */
  public static int addTwoInts(int num1, int num2) {
    return num1 + num2;
  }// end addTwoInts()


  /**
   * Method name: addTwoInts
   * purpose: a public class method that will add 2 double vals and return the some.
   * Accepts: 2 ints to be added.
   * returns: an in value that is the sum of the 2 args.
   */
  public static double addTwoDoubles(double dub1, double dub2) {
    return dub1 + dub2;
  }// end addTwoDoubles()




}//end Main class
