package Selection_Structures_Chp3;

/**
 *Program Name: Selection_Structures_Chp3.Conditional_Operator_Example.java
 *Purpose: Shows the use of the conditional or ternary operator, which can be used to do an if-else
 *				 structurein just one line of code.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 1, 2018 | 12:32:23 PM
 */

public class Conditional_Operator_Example
{

	public static void main(String[] args)
	{
		
		//do the familiar first... use a standard if-else block
		int num1 = 8;
		int num2 = 13;
		int minVal;
		
		System.out.println("Val of num1 is " + num1);
		System.out.println("val of num2 is " + num2);
		
		if(num1 > num2)
		{
			minVal = num1;
		}
		else
		{
			minVal = num2;
		}
		
		System.out.println("using conditional i, val assuigned to minVal is " + minVal);
		
		System.out.println("Now doing the same comparrison using conditional operator...");
		
		/**
		 * First operand is the boolean expression ot condition to be tested
		 * Second operant is the val to be used if the expression is true
		 * third operand is the val to be used if the expression is false
		 */
		
		minVal = (num1 > num2) ? num1 : num2;// conditional opperator
		
		System.out.println("using conditional operator, value assigned to minVal is " + minVal);
		
	}

}
