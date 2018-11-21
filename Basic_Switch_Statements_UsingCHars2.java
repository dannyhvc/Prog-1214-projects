package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Basic_Switch_Statements_UsingCHars2.java
 *Purpose: shows the baisc set yp of a swithc statment in whcih is an alternatice to using an if statement
 *				(note) a switch statement can only do equality tests.
 *
 *			revision: added cases to hanfle lower case a letter input
 *						(note)this is the "inelegant way to do it"
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 3, 2018 | 3:36:13 PM
 */

import java.util.*;

public class Basic_Switch_Statements_UsingCHars2
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //creates a scanner
		
		//present a question
		System.out.println("Which of the following data types uses the most memory?");
		
		//prompt the selections
		System.out.println("A: byte\t");
		System.out.println("B: short\t");
		System.out.println("C: int\t");
		System.out.println("D: long\t");
		
		//prompt user for response
		System.out.print("enter a choice: ");
		
		//we'll convert the string into a char
		char choice = in.next().charAt(0);
		in.close();
		
		//set up the switch
		
		switch(choice)
		{
		
		//revision: added cases for lower case letters.
		//				for each break statement.
		
		case 'a':
		case 'A': System.out.println("\nA is incorrect, D was the anwer");
		break;
		
		case 'b':
		case 'B': System.out.println("\nB is incorrect, D was the anwer");
		break;
		
		case'c':
		case 'C': System.out.println("\nC is incorrect, D was the anwer");
		break;
		
		case'd':
		case 'D':System.out.println("Correct! Well done!");
		break;
		
		default:System.out.println("Your entre of " + choice + " is not amoung the options.");//else part of the switch
		}//end swtich
		
		System.out.println("\n\n$$END_PROGRAM$$"); //proofing for debugging
		
	}

}
