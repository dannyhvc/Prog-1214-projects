package Operator_And_Arethmatic;

/**
 *Program Name: Operator_And_Arethmatic.IncrementOperator_Example.java
 *Purpose: show the use of the increment operator in both the PRE-FIFX mode and
 *				 in the POST-FIX mode, and he SUBTLE DIFFERENCES between these modes.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 19, 2018 | 3:31:47 PM
 */

public class IncrementOperator_Example 
{

	public static void main(String[] args) 
	{
		// need an int varianle to start ...
		int num1 = 1;
		System.out.println("current value of num1 is " + num1);
		
		//use the incement in POST-FIX mode 1st
		System.out.println("Current value of num1 is " + num1++);
		System.out.println("Current value of num1 is now " + num1);
		
		//use the increment in PRE-FIX mode 2nd
		System.out.println("\nCurrent value of the num1 is " + ++num1);
		System.out.println("(after another PRE-FIX mode) Current value of the num1 is " + ++num1);
		
		//some code handed in many years ago by a CPA student...
		int num2 = 15;
		num2 = num2++ + ++num2;
		System.out.println("value of of num2 after that series is " + num2);
		
	}//end main

}//end class
