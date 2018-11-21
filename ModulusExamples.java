package Operator_And_Arethmatic;

/**
 *Program Name: Operator_And_Arethmatic.ModulusExamples.java
 *Purpose: Just shows a few examoples of using modulus division
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 20, 2018 | 2:12:12 PM
 */

public class ModulusExamples 
{

	public static void main(String[] args) 
	{
		//start with a variable of type int
		int num1 = 5;
		System.out.println("print values of num1 is " + num1);
		
		System.out.println("doing regular division of 5 by 2: " + (num1/2));
		
		System.out.println("Doing modulus division of 5mod(2): " + (num1%2));
		
		System.out.println("Doing 6mod(2): " + (6%2));
		
		//if amod(b) and a<b ,then amod(b) = a
		System.out.println("Doing 2mod(6): " + (2%6));
		
		double num2 = 6.5;
		System.out.println("Doing 6.5mod(2): " + (num2%2));
		
		
		
	}

}
