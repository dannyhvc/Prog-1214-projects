package Operator_And_Arethmatic; /**
 *Program Name: Operator_And_Arethmatic.OddOrEven.java
 *Purpose: Shows use of the modoulus division to deternmine if a value is odd or even
 *			   also give us and introduction to if-else conditional structure.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 20, 2018 | 2:21:58 PM
 */

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String args[])
	{
		//create Scanner
	Scanner in = new Scanner (System.in);
	
	//input section
	//prompt iser to enter an integer value
	System.out.print("Enter an interger and I'll tell you if it odd or even: ");
	int ui = in.nextInt();
	
	//porcessing section
	//use an if-else structure to determine add or even
	if(ui%2 == 0)
	{
		//if true, run the code below. if false, skip the code below.
		System.out.println(ui + " is an even number");
		
	} else {
		System.out.println(ui + " is an odd number");
		
	}//end of condition
	
	
	in.close();// good house keeping.

	}
}
