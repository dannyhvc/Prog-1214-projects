/*(note) VERY BLOATED PROGRAM.
* purpose: simulates the rolling of a pair of dice. We'll record how often each val from 2-12
*          is rolled, and we'll calc the % frequency of each val from 2-12.
*
*          revision: we replaced the 11 accumulator vars with 1 array.
*
*          PSEUDO-CODE:
*          1) create CONSTANT to control total num of tosses
*          2) revision: create an array to hold to hold each possible outcome.
*          3) create vars to hold random vals for each die and the total of both.
*          4) LOOP:
*               generate 2 random val from 1-6
*               sum the 2 random vals and increment the appropriate accumulator
*               UNTIL Number of tosses made equals constant
*          5) report total number of tosses and the # for each outcome, and % freq.
 */

package Arrays_Chp6;

public class Dice_2 {
  public static void main(String[] args) {
    //1) create CONSTANT to control total num of tosses
    final int NUM_TOSSES =100_000_000;


    //2) create acumulator var for each possible outcome
    /*
     *  roll of the dice can be incremented in the element
     * with the same index number as the total of the roll
     */
    int[] rollsArray = new int[13];

    //3) create vars to hold random vals for each die and the total of both.
    int die1;
    int die2;
    int rollTotal;

    //4) LOOP: UNTIL Number of tosses made equals constant
    for(int i=1; i<= NUM_TOSSES; i++){
      //generate 2 random val from 1-6
      die1 = (int) (Math.random() * 6 + 1);
      die2 = (int) (Math.random() * 6 + 1);
      rollTotal = die1 + die2;

      //increament the element whose index is the same as the rollTotal.
      rollsArray[rollTotal]++;//adds one to whatever val is in the element.
    }
    System.out.println("Total num of rolls made was " + NUM_TOSSES);

    //traverse the array using a loop..
    //counter at 2, because element #) and #1 were not used for anything and just
    //have values of 0.
    for(int i=2; i < rollsArray.length; i++){
      System.out.println("# of rolls " + i + " was " + rollsArray[i] +
          ", which is a " + (((double) rollsArray[i]/NUM_TOSSES) * 100) + "%.");

    }//end forL

    System.out.println("END OF PROGRAM");

  }//end main   
}//end class
