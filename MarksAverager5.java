/*
 * Program Name: MarksAverager4.java
 * Purpose: shows how to use a loop to VALIDATE input data. 
 *          Also introduces concept of the ACCUMULATOR variable, which is just a 
 *          fancy name for a runningTotal variable. 
 *          This program will calculate the average of a set of test scores.
 * Coder: Daniel Herrera 0881570 or Section 02
 * Date:Oct 29, 2018
 * 
 *  REVISION 1:changed the accumulator variable to an array so that
 *           we can keep all the test scores for later analysis.
 *
 * 	REVISION 2: added some code to calc the median score of all the scores entered.
 *
 * 	REVISION 3:
 * 
 * PSEUDOCODE
 * 1) create Scanner
 * 2) explain program
 * 3) prompt user to enter how many test scores will be entered.
 * 4) ask user to enter VALIDATION CRITERIA...lowest possible score and highest possible score
 * 5) REVISION:create and initialize an array to hold the test scores.
 * 6) LOOP
 *     prompt for a test score
 *     VALIDATE the test scoreBEFORE YOU STORE 
 *      IF VALID
 *        REVISION: add the value to the array
 *      ELSE
 *        tell them its INVALID and to RE-ENTER
 *    UNTIL all scores entered.
 * 7) calculate average and report.
 * 
 */


package Arrays_Chp6;

import java.util.Scanner;


public class MarksAverager5 {

	public static void main(String[] args) {
		// 1) create Scanner
		Scanner input = new Scanner(System.in);
		
		//2) explain program
		System.out.println("This app will calculate the average of your set of test scores.");

		//3) prompt user to enter how many test scores will be entered.
		System.out.print("Enter how many test scores will be entered: ");
		int numTests = input.nextInt();
		
		//4) ask user to enter VALIDATION CRITERIA
		System.out.print("Enter lowest possible score on test: ");
		int lowScore = input.nextInt(); 
		System.out.print("Enter highest possible score on test: ");
		int highScore = input.nextInt();

		double runningTotal = 0.0;
		//REVISION HERE
		//5) create an array to hold the test scores based on how many test scores
		///   will be entered.
		
		double[] testScoresArray = new double[numTests];
		String[] namesArray = new String[numTests];

		
		//6 set up the loop and create a variable to temporarily hold the testScore
		double testScore;
		//loopCounter
		int loopCounter = 0;//Changed this to start at 0
		
		while(loopCounter < testScoresArray.length) {
		  input.nextLine();
      System.out.println("Enter the name of student#: " + (loopCounter + 1) + ":");
      namesArray[loopCounter] = input.nextLine();


			//prompt for a test score
			System.out.print("Enter test score# " + (loopCounter + 1) + " and press ENTER.");
			testScore = input.nextDouble();
			
			//VALIDATE USING INSIDE THE FENCE CHECK
			if(testScore >= lowScore && testScore <= highScore) {
				//if we get here we have VALID DATA
				// REVISION: Add it to the array and INCREMENT THE LOOP COUNTER
				//runningTotal += testScore;
				
				testScoresArray[loopCounter] = testScore;
				
				loopCounter++;
			} else {
				//BAD DATA! Tell user and DO NOT INCREMENT LOOP COUNTER.
				System.out.println("The score " + testScore + " is outside specified range. Please re-enter.");	
			}
			
		}//end while
		
		//TRAVERSE the array using a for loop so that we can add up all the 
		// values that were entered. Store this in runningTotal
		
		for(int i = 0; i < testScoresArray.length; i++) {
			runningTotal += testScoresArray[i];
		}//end for

    /*
      * want ot print the names of all the students and their test scores on here
      * Before we calc the Median, because we have to sort tje array to calc the median
      * we need to process the namesArray and the testScoresArray IN PARALLEL inside one loop.
     */

    System.out.println();
    for(int i=0; i < testScoresArray.length; i++) {
      System.out.println("Student name " + namesArray[i] + ":\t\t" +
          testScoresArray[i]);
    }//end for
		
		
		//7) calculate average and report.
		double average = runningTotal/numTests; //no shark problem here, double/int
		System.out.println("The average of your " + numTests + " tests was " + average +
				               " out of " + highScore);

		//calculate and display the MEDIAN of all the scored
		/*
		 * (Step 1) sort the array into ASCENDING order using array.sort().
		 * 					(note) the array class is a utility class in the java.util package
		 * we can either do an import statment up top (import java.util.Array;) OR we can
		 * use the fully QUALLIFED PATH NAME to acces the method.
		 */

		java.util.Arrays.sort(testScoresArray);
		double median;
		//(step 2) determine if array.length is odd or even & calc median as required.
		if(testScoresArray.length % 2 == 1) {
			//array has ODD number of elements
			int middleIndex = testScoresArray.length / 2;  // integer division gives answer
			median = testScoresArray[middleIndex];

		} else {
			int right_middleIndex = testScoresArray.length / 2;
			int left_middleIndex = testScoresArray.length / 2 - 1;

			//calc the average of these 2 middle vals
			median = (testScoresArray[right_middleIndex] + testScoresArray[left_middleIndex]) / 2;
		}
		//report
		System.out.println("Median value of the " + numTests + " test scores was " + median);

		//calc the range of the test scores.
		//(note)
		double lowestScoreEntered = testScoresArray[0];
		double highestScoreEntered = testScoresArray[testScoresArray.length - 1];
		double range = highestScoreEntered - lowestScoreEntered;

		System.out.println("\nHighest Score entered: " + highestScoreEntered);
		System.out.println("Lowest Score entered: " + lowestScoreEntered);
		System.out.println("The range: " + range);

		//print the two array in parallel again to show how the data has been corrupted because we
    // sorted the

	}//end main

}//end class
