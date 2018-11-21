/*
 * Project Name: SumArrayContents_tester.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/12/2018 | Time: 12:48 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

public class SumArrayContents_tester {
  public static void main(String[] args) {
    //test array
    int[] intArray = new int[100];
    double[] doubleArray = new double[100];

    //populate it with vlaes from 1 - 25
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i + 1;
    }//end for

    //populate it with vlaes from 1 - 25
    for (int i = 0; i < doubleArray.length; i++) {
      doubleArray[i] = i + 1;
    }//end for

    System.out.println("total:");
    int sum = MyToolbox.sumArrayContents(intArray);
    double sum_2 = MyToolbox.sumArrayContents(doubleArray);

    System.out.println(sum);
    System.out.println(sum_2);
  }//end main()

}//end Main class
