package Selection_Structures_Chp3;

/**
 *Program Name: Selection_Structures_Chp3.Basic_AND_OR_ex.java
 *Purpose: shows the precadence of AND and OR boolean arethmatic
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 3, 2018 | 2:46:57 PM
 */

public class Basic_AND_OR_ex
{

	public static void main(String[] args)
	{
		//three conditions: (NOTE) vary the values of the 3 conditions to see the concluding outcome of the expressions
		
		boolean con1 = false;
		boolean con2 = true;
		boolean con3 = true;
		
		//(note) try: false,true,true
		//				  false,false,true
		//test these conditions in various con=mbinations
		
		//block 1:
		if(con1 && con2 || con3)
		{	
			System.out.println("STUB b1 : value of con1 is " + con1);
			System.out.println("STUB b2 : value of con1 is " + con2);
			System.out.println("STUB b3 : value of con1 is " + con3);
			System.out.println("OVERALL RESULT block1: true");
		}
		else
		{
			System.out.println("STUB b1 : value of con1 is " + con1);
			System.out.println("STUB b2 : value of con1 is " + con2);
			System.out.println("STUB b3 : value of con1 is " + con3);
			System.out.println("OVERALL RESULT block 1: false");
		}
		
		//block 2
		System.out.println
		(
			"\nNow doing the same coomparison but with the two operands of the OR insides a set of brackets\n"
		);
		
		if(con1 && (con2 || con3))
		{	
			System.out.println("STUB b1 : value of con1 is " + con1);
			System.out.println("STUB b2 : value of con1 is " + con2);
			System.out.println("STUB b3 : value of con1 is " + con3);
			System.out.println("OVERALL RESULT block 2: true");
		}
		else
		{
			System.out.println("STUB b1 : value of con1 is " + con1);
			System.out.println("STUB b2 : value of con1 is " + con2);
			System.out.println("STUB b3 : value of con1 is " + con3);
			System.out.println("OVERALL RESULT block 2: false");
		}
		
		

	}//end main

}//end class
