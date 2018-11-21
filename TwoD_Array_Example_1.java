/*
 * Project Name: TwoD_Array_Example_1.java
 * Purpose: shows the creation of a 2D array
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/1/2018 | Time: 2:19 PM
 */

//

package Arrays_Chp6;

public class TwoD_Array_Example_1 {
  public static void main(String[] args) {
    //build the array... rows before hoes
    int[][] tableArray = new int[2][3];

    //enter data directly into each cell by refrencing its row and column number
    tableArray[0][0]=5;
    tableArray[0][1]=8;
    tableArray[0][2]=42;
    tableArray[1][0]=47;
    tableArray[1][1]=23;
    tableArray[1][2]=76;

    System.out.println("Value in the element 0,2 = " + tableArray[0][2]);

    // returns the number of rows.
    System.out.println("\nLength of tableArray = " + tableArray.length);

    // shows the length of columns by using the length of child array.
    // here its asking for the length of child array in row 0
    System.out.println("\nLength of tableArray = " + tableArray[0].length);



  }//end main()   
}//end Main class
