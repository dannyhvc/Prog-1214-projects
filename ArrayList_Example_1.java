/*
 * Project Name: ArrayList_Example_1.java
 * Purpose: shows how to create an array list obj which we often call an array on steroids.
 *          in this first version we'll create an array list that is NOT type safety. which means that we can
 *          store and type of obj in it.s
 *
 *          revision (nov 1): added another Integer obj but we created this one without using the constructor
 *                            method, since it has been deprecated. Instead we used the Integer obj with a
 *                            specified value.
 *
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 10/31/2018 | Time: 2:35 PM
 */

//

package Arrays_Chp6;
import java.util.*;

public class ArrayList_Example_1 {
  public static void main(String[] args) {
    //create a NON-PARAMATERIZED or NON-TYPE SAFTIED arralist
    //IDEA will worn you about it.
    ArrayList rawList = new ArrayList();

    //add some vals using the add() method
    String name1 = "Dan";
    rawList.add(name1);

    //create some other obj of different types
    Scanner in = new Scanner(System.in);
    rawList.add(in);
    in.close();

    Integer num1 = new Integer(33);
    rawList.add(num1);

    //print out the contents of each element
    System.out.println("Element stored in element 0 is + " + rawList.get(0));
    System.out.println("Element stored in element 1 is + " + rawList.get(1));
    System.out.println("Element stored in element 2 is + " + rawList.get(2));

    //revision #1: create another Integer obj using the integer class method.
    Integer num3 = Integer.valueOf(55);

  }//end main()   
}//end Main class
