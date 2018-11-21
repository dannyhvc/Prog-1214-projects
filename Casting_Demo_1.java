package Operator_And_Arethmatic;

/**
 *Program Name: Operator_And_Arethmatic.Casting_Demo_1.java
 *Purpose: Shows examples of both IMPLICIT and EXPLICIT casting applied
 *         to vaiables of various primitive data types.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 19, 2018 | 2:32:29 PM
 */

public class Casting_Demo_1
{

	public static void main(String[] args) 
	{
		// Start with implicit casting examples where we store a smaller capacity value
		// into a larger capacity variable.
		byte byteNum = 127;
		System.out.println("Value stored in byteNum is " + byteNum);
		
		//First implicit case... assign in byteNum to a variable tyoe short.
		short shortNum = byteNum;
		System.out.println("Value stored in shortNum is " + shortNum);
		
		//now assign the shotNum to an int variable
		int intNum = shortNum;
		System.out.println("Value stored in intNum is " + intNum);
		
		//and finally long...
		int longNum = shortNum;
		System.out.println("Value stored in longNum is " + longNum);
		
		//examples of explicit casting
		//first, use the incrment opwearoe ro add one to vale in longNum
		longNum++;
		System.out.println("Value stored in the longNum is now " + longNum);
		
		intNum = longNum; //Java will not implicitly do this assignment.
		
		//must do an explicit casttro make it happen
		intNum = (int)longNum;
		System.out.println("Value stored in intNum " + intNum);
		
		//go from int to short
		shortNum = (short)intNum;
		System.out.println("value stored in shortNum " + shortNum);
		
		//go from short to byte
		byteNum = (byte)shortNum;
		System.out.println("value of byteNum is " + byteNum);
		
		//using floating point values
		float floatNum = 2.34f;
		System.out.println("\nValues of floatNum is " + floatNum);
		
		//going fromi a float to a double
		double doubleNum = floatNum;
		System.out.println("Value of doubleNum is " + doubleNum);
		doubleNum++;
		//going from double to float
		floatNum = (float)doubleNum;
		System.out.println("Value of stored floatNum is " + floatNum);
		
		//casting a double to an int
		intNum = (int)doubleNum;
		System.out.println("\nvalue stored in intNum is " + intNum);
		
		

	}//end main

}//end Operator_And_Arethmatic.Casting_Demo_1




