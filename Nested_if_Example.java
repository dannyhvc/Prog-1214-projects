package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Nested_if_Example.java
 *Purpose: shows the use of a nested if-statement structure to evaluate 2 different conditions at the
 *				 same time.
 *
 *				Scenario: Recruiting for the rcmp police.
 *								  Applicant must meet both the min weight and min height standards to be considered. 
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

public class Nested_if_Example
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
		
		/*5) Process:
		 *		NESTED IF-STATEMENT
		 */
		
		if(height >= MIN_HEIGHT)
		{
			//if they get through the 1st foor, ask their weight
			System.out.print("Enter your wieght in kg: ");
			weight = in.nextDouble();
			
			if(weight >= MIN_WEIGHT)
			{
				//if we get here they meet the requirements
				System.out.println("Congratulations! you meet the physical requirements!");
				
			}//end inner if
			else
			{
				System.out.println("sorry you're to light!");
			}//end inner else
			
		}//end outer if 
		else
		{
			System.out.println("sorry kid you're to short!");
		}//end outer else
		
		in.close();//close scanner
		
	}//end main

}//end class
