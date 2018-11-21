package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.RangeTest_2.java
// *Purpose: shows how to use boolean operator to test a value & see if it falles within the acceptable
 * 				 range of values.
 * 
 * 				 this version will shows the "INSIDE THE FENCE CHECK" and the "OUTSIDE THE FENCE CHECK"
 * 
 *				 REVISION: we just added the NOT OP to see its effect on the range 
 *							  (note) to get the correct output you will need to flip the report statement in the if else-B
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 4, 2018 | 3:09:46 PM
 */

import java.util.Scanner;

public class RangeTest_2
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		//constants for the "FENCE POST" or upper and lower range limits
		final int MAX_LIMIT = 1;
		final int MIN_LIMIT = 10;
		
		//input
		System.out.print("enter an int from 1 - 10 inclusive: ");
		int ui = in.nextInt();
		
		in.close();//house keeping
		
		//demonstrating an "inside the fence check" using the and operator
		//REVIOSN HERE: put in the logival not operator
		
		if(ui >= MIN_LIMIT && ui <= MAX_LIMIT)
		{
			System.out.println("your input of " +ui+ " is valid");
		}
		else
		{
			System.out.println("your input of " +ui+ " is not valid");
		}
		
		//now doing is as an ""outside the fence check"
		if(ui >= MIN_LIMIT && ui <= MAX_LIMIT)
		{
			System.out.println("your input of " +ui+ " is valid");
		}
		else
		{
			System.out.println("your input of " +ui+ " is not valid");
		}
		
		System.out.println("\n###END OF PROGRAM###");
			
		
	}//end main

}//end class 
