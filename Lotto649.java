/**
 * purpose: to generate 6 random numbers in a range 1-49 for a lotto649 ticket.
 * AUTHORS NOTE: if you use this app and win the jackpot bill wants 10%.
 *
 * 2 CODING CHALLENGES:
 *      1) add some code to the output loop so that the comma does not print after the last number.
 *      2) add some code to the random number generation loop so that if a duplicate value is generated
 *         , it is discarded and another value is generated.
 */

package Arrays_Chp6;

public class Lotto649 {
  public static void main(String[] args) {
    //set low and high range value for random generator
    final int LO = 1;
    final int HI = 49;

    //creates array to hold the values.
    int[] luckArray = new int[6];

    /*
      * general purpose formula to generate positive number values in a certain range.
      * randomValue = (int) (Math.random() * (HI -LO + 1) +LO));
     */
    //for loop to populate the array with random values
    for(int i=0; i < luckArray.length; i++){
      if(i == 5) {
        luckArray[i] = (int) (Math.random() * (HI - LO + 1) + LO);
      } else {
        luckArray[i] = (int) (Math.random() * (HI - LO + 1) + LO) ;
      }
    }//end forL

    //lets sort the array in a ASCENDING order by using a utility method for the java lib.
    java.util.Arrays.sort(luckArray);

    //now run another loop to traverse and print out the values
    System.out.println("Your lucky Lotto649 numbers are: ");
    for(int i=0; i < luckArray.length; i++) {
      System.out.print(luckArray[i] + ", ");
    }

  }//end main
}//end class
