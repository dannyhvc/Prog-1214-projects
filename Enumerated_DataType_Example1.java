package Operator_And_Arethmatic;

/**
 *Program Name: Operator_And_Arethmatic.Enumerated_DataType_Example1.java
 *Purpose: Shows how to create an enumerated data type, which is basically a custom
 *				 data type that the coer can create.
 *
 *				Note: Enum dataTypes must be declared above the main method, in what we call
 *							the class wide scope area.
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 24, 2018 | 12:10:03 PM
 */

public class Enumerated_DataType_Example1
{
	
	//CLASS WIDE SCOPE AREA
	//an enum follow class naming convention.
	//values inside an enum are consitdered to be constant values, so we use all caps here.
	
	public enum Marital_Status{MARRIED, SINGLE, COMMOIN_LAW, SPERATED, DIVORCED};
	
	public static void main(String[] args)
	{
		//create 2 vars of type Marital_Status
		Marital_Status taxPayer1 = Marital_Status.SINGLE;
		Marital_Status taxPayer2 = Marital_Status.MARRIED;
		
		System.out.println("Marital Status of taxPayer1: " + taxPayer1);
		System.out.println("Marital Status of taxPayer2: " + taxPayer2);
		
		
		
	}

}
