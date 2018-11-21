package Selection_Structures_Chp3;

/**
 *Program Name: Selection_Structures_Chp3.Basic_Not_ex.java
 *Purpose: shows the logic behind the not operator.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 3, 2018 | 3:20:21 PM
 */

public class Basic_Not_ex
{

	public static void main(String[] args)
	{
		
		int temp = 100; //var for tempurature
		final int BOILING_POINT = 100; //constant for boiling point
		
		if(temp>= BOILING_POINT)
		{
			System.out.println
			(
				"a temp of " + temp + "is equal to or " + "greater than the boiling point of water."
			);
			
		}
		else
		{
			System.out.println
			(
				"a temp of water " + temp + " is below " + " the boiling point of water."
			);
		}
		
		System.out.println("\nNow the same comparisson using the logical Not operator...");
		
		
		//this condition does the same thing as the one above it's just in a NOT logical operation.
		if(!(temp>= BOILING_POINT))
		{
			System.out.println
			(
				"a temp of water " + temp + " is below " + " the boiling point of water."
			);
			
		}
		else
		{
			System.out.println
			(
				"a temp of " + temp + "is equal to or " + "greater than the boiling point of water."
			);
		}
		
		
		
	}

}
