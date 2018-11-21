/*(note) VERY BLOATED PROGRAM.
* purpose: simulates the rolling of a pair of dice. We'll record how often each val from 2-12
*          is rolled, and we'll calc the % frequency of each val from 2-12.
*
*          PSEUDO-CODE:
*          1) create CONSTANT to control total num of tosses
*          2) create acumulator var for each possible outcome
*          3) create vars to hold random vals for each die and the total of both.
*          4) LOOP:
*               generate 2 random val from 1-6
*               sum the 2 random vals and increment the appropriate accumulator
*               UNTIL Number of tosses made equals constant
*          5) report total number of tosses and the # for each outcome, and % freq.
 */

package Arrays_Chp6;

public class Dice_1 {
  public static void main(String[] args) {
    //1) create CONSTANT to control total num of tosses
    final int NUM_TOSSES =100000000;


    //2) create acumulator var for each possible outcome
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;

    //3) create vars to hold random vals for each die and the total of both.
    int die1;
    int die2;
    int rollTotal;

    //4) LOOP: UNTIL Number of tosses made equals constant
    for(int i=1; i<= NUM_TOSSES; i++){
      //generate 2 random val from 1-6
      die1 = (int)(Math.random() * 6 + 1);
      die2 = (int)(Math.random() * 6 + 1);
      rollTotal = die1 + die2;

      //sum the 2 random vals and increment the appropriate accumulator
      switch (rollTotal){
        case 2: count2++;
          break;

        case 3: count3++;
        break;

        case 4: count4++;
          break;

        case 5: count5++;
          break;

        case 6: count6++;
          break;

        case 7: count7++;
          break;

        case 8: count8++;
          break;

        case 9: count9++;
          break;

        case 10: count10++;
          break;

        case 11: count11++;
          break;

        case 12: count12++;
          break;

        default:
          System.out.println("Logic error: in random num gen.");

      }//end switch.
    }//end loop

    //5) report total number of tosses and the # for each outcome, and % freq.
    System.out.println("Total number of tosses made was " + NUM_TOSSES);
    System.out.println(
        "# of 2's was: " + count2 + " and percentage was " + ((double)count2/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 3's was: " + count3 + " and percentage was " + ((double)count3/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 4's was: " + count4 + " and percentage was " + ((double)count4/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 5's was: " + count5 + " and percentage was " + ((double)count5/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 6's was: " + count6 + " and percentage was " + ((double)count6/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 7's was: " + count7 + " and percentage was " + ((double)count7/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 8's was: " + count8 + " and percentage was " + ((double)count8/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 9's was: " + count9 + " and percentage was " + ((double)count9/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 10's was: " + count10 + " and percentage was " + ((double)count10/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 11's was: " + count11 + " and percentage was " + ((double)count11/NUM_TOSSES)*100 + "%");
    System.out.println(
        "# of 12's was: " + count12 + " and percentage was " + ((double)count12/NUM_TOSSES)*100 + "%");

    System.out.println("end of program.");

  }//end main   
}//end class
