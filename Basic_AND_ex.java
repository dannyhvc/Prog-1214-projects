package Selection_Structures_Chp3; /**
 *Program Name: Nested_if_Example2.java 
 *Purpose: shows the use of a nested if-statement structure to evaluate 2 different conditions at the
 *				 same time.
 *
 *				Scenario: Recruiting for the rcmp police.
 *								  Applicant must meet both the min weight and min height standards to be considered. 
 *
 *				REVISION: ADDED IF-ELSE-IF statment in the else block to give the usedr some detail feedback
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 1, 2018 | 12:49:00 PM
 *
 *PSEUDO-CODE:
 *1) Create a Scanner
 *2) Create some constants for the weight and height standards
 *3) Explain progran to user
 *4) input: create varible to hold user inputs and prompt for height
 *5) Process:
 *		if height >= min Height
 *			ask for weight
 *				if weight  >= min Weight
 *					tell them they are accepted 
 *6) tell them they are accepted 
 *
 */

import java.util.Scanner;

public class Basic_AND_ex
{

	public static void main(String[] args)
	{
		
		//1) Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//2) Create some constants for the weight and height standards
		final double MIN_WEIGHT = 50.0; //weight in kg
		final double MIN_HEIGHT = 150.0;//height in centimeteres
		
		//3) Explain progran to user
		System.out.println("This program will tell you if you meet the physical requirements fo the RCMP");		
		
		//4) input: create varible to hold user inputs and prompt for height
		double height;
		double weight;
		
		System.out.print("Enter your height in cm: ");
		height = in.nextDouble();
		
		System.out.print("Enter your weight in kg: ");
		weight = in.nextDouble();
		
		/*5) Process:
		 *		NESTED IF-STATEMENT
		 */
		
		if(height >= MIN_HEIGHT && weight >= MIN_WEIGHT)
		{
			System.out.println("Congtrats! you did it! You're big enough");
		}
		else
		{
			
			if(height < MIN_HEIGHT && weight < MIN_WEIGHT)
			{
				System.out.println("Sorry you're both to light and to short");
			}
			else if(height < MIN_HEIGHT)
			{
				System.out.println("Sorry, you're to short.");
			}
			else
			{
				System.out.println("Sorry, you're to ligth!");
			}
			
		}
		
		in.close();//close scanner
		
	}//end main

}//end class
