
/*
 * Project Name: calcArrayAverage_tester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/12/2018 | Time: 1:20 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

public class calcArrayAverage_tester {
  public static void main(String[] args) {
    //test array
    int[] intArray = new int[100];
    double[] doubleArray = new double[700];

    //populate it with vlaes from 1 - 25
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 1;
    }//end for

    System.out.println("total:");
    double avg1 = MyToolbox.calcArrayAverage(intArray);
    System.out.println("avg1 = " + avg1);

  }//end main()   
}//end Main class
