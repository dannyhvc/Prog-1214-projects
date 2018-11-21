package Operator_And_Arethmatic;

/**
 *Program Name: Operator_And_Arethmatic.Enumerated_DataType_Example1.java
 *Purpose: Shows 
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 24, 2018 | 12:10:03 PM
 */

public class Enumerated_DataType_Example3
{
	
	//CLASS WIDE SCOPE AREA
	//an enum follow class naming convention.
	//values inside an enum are consitdered to be constant values, so we use all caps here.
	
	public enum CardSuit{CLUBS, DIAMONDS, HEARTS, SPADES};
	
	public static void main(String[] args)
	{
		//create 2 vars of type CardSuit
		CardSuit card1 = CardSuit.CLUBS;
		System.out.println("suit of card1 is " + card1);
		
		CardSuit card2 = CardSuit.SPADES;
		System.out.println("suit of card2 is " + card2);		
		
		System.out.println("ordinal " + card1.ordinal());
		System.out.println("ordinal " + card2.ordinal());
				
	}

}
