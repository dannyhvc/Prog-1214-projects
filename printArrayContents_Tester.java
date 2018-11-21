/*
 * Project Name: printArrayContents_Tester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/7/2018 | Time: 2:51 PM
 */
package Methods_Chp6;
import Methods_Chp6.MyToolbox;

import java.util.Random;

public class printArrayContents_Tester {
  public static void main(String[] args) {
    {
      //create a test array and fill it with 100 random ints from 1 - 100
      int[] tstIntArray = new int[100];

      //loop to populate
      for (int i = 0; i < tstIntArray.length; i++) {
        tstIntArray[i] = (int) (Math.random() * 100 + 1);
      }//end for

      System.out.print("The contents of the tstIntArray are:");
      MyToolbox.printArrayContents(tstIntArray);
    }

    {
      //test overloaded version for type double.
      //create a test array and fill it with 100 tandom ints from 1 - 100
      double[] tstDoubleArray = new double[10];

      //loop to populate
      for (int i = 0; i < tstDoubleArray.length; i++) {
        tstDoubleArray[i] = Math.floor((Math.random() * 100 + 1) * 100) / 100;
      }//end for

      System.out.print("\nThe contents of the tstDoubleArray are:");
      MyToolbox.printArrayContents(tstDoubleArray);
    }

    {
      //generate an array of 50 UPPER CASE LETTERS with an ASCII vlau ranging from 65 ('a') to 90 ('Z')
      char[] tstCharArray = new char[50];
      Random random = new Random();
      //loop to populate
      for (int i = 0; i < tstCharArray.length; i++ ) {
        tstCharArray[i] = (char) (random.nextInt(26) + 65);
      }//end loop

      System.out.print("\nThe contents of the tstCharArray are:");
      MyToolbox.printArrayContents(tstCharArray);
    }





  }//end main()   
}//end Main class
