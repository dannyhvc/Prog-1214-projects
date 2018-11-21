 /*
  * Purpose: shows how to create an array of type int, put some vals into it , retrieve same vals from
  *         it, and uses a for loop to TRAVERSE the array.
 */

package Arrays_Chp6;

public class Basic_Int_Array_Example {
  public static void main(String[] args) {
    System.out.println("Basic Array Of Type int with 5 vals...");
    //create array
    int[] intArray = new int[5];

    //insert some values.
    intArray[0] = 45;
    intArray[2] = 378;
    intArray[4] = 67;

    //retreive the values
    System.out.println("Val in element 0 is " + intArray[0]);
    System.out.println("Val in element 2 is " + intArray[2]);
    System.out.println("Val in element 4 is " + intArray[4]);

    //using a for loop to traverse an array
    System.out.println("\nNow using a for loop to traverse an array...");
    for(int i = 0; i < intArray.length; i++){
      System.out.println("Value in element #" + i + " is "+ intArray[i]);
    }  //end for_loop

    System.out.println("END PROGRAM");

  }//end main   
}//end class
