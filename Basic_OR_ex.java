package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Basic_OR_ex.java
 *Purpose:	shoes the use of the boolean or operator
 *
 *				scenario: you are apllying for a bank loan. Bank has 2 conditions
 *				c1: must hava a jo with a salary >= $25k
 *				c2: must have a min net worht of $20k
 *	
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 3, 2018 | 2:24:24 PM
 *
 *PSEUDO-CODE:
 *1) create scanner
 *2) explain program
 *	2)A) create CONSTANTS for min salary and net worth
 *3) get user input
 *4) compare user in. using or
 *5) output result
 *6) close scanner
 *
 */

import java.util.Scanner;

public class Basic_OR_ex
{
	public static void main(String args[]) 
	{
		//1) create scanner
		Scanner in = new Scanner(System.in);
		
		//2) explain program
		System.out.println("This program will asses your elegibility for a loan.");
		
		//2)A) create CONSTANTS for min salary and net worth
		final double MIN_SALARY = 25_000.0;
		final double MIN_NWORTH = 20_000.0;
		
		//3) get user input
		System.out.print("Entre you salary (CAD): ");
		double salary = in.nextDouble();
		
		System.out.print("Enter your current net worth (CAD): ");
		double net_worth = in.nextDouble();
		
		in.close();
		
		//4) compare user in. using or
		if(salary >= MIN_SALARY || net_worth >= MIN_NWORTH)
		{
			System.out.println("Congrats, you qualify for a loan!");
		}
		else
		{
			System.out.println("sorry...you don't qualify for a loan.");
		}
		
		System.out.println("\n\n$$END_PROGRAM$$"); //proofing for debugging
		
	}//end main
	

}//end class
