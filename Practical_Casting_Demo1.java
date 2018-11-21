package Operator_And_Arethmatic; /**
 *Program Name: Operator_And_Arethmatic.Practical_Casting_Demo1.java
 *Purpose:Shows a practial application of casting im the limiting how mant decimal
 *			  places are diplayed to the right of the decimal point after doing calculations
 *				with floating point values.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 24, 2018 | 12:43:43 PM
 */

import java.util.Scanner;

public class Practical_Casting_Demo1
{

	public static void main(String[] args)
	{
		final double HST_RATE = 0.13;
		Scanner in = new Scanner(System.in);
		//some useful variables
		double price;
		double salesTaxPayable;
		double totalPrice;
		String fullName;
		
		//input section
		System.out.print("enter the price of your purchase: ");
		price = in.nextDouble();//rude house guest
		
		//flush the buffer
		in.nextLine();
		
		System.out.print("enter the your full name for the bill: ");
		fullName = in.nextLine();
		
		//processing
		//calculate salesTaxPayable
		salesTaxPayable = price * HST_RATE;
		System.out.println("On the purchase of " + price + ", the salesTaxPayble is " + salesTaxPayable);
		
		//calculate the total price
		totalPrice = price + salesTaxPayable;
		System.out.println("total amount due by "+fullName+" is $"+ totalPrice);
		System.out.println("\nSTUB A: VALUE totalPrice is now " + totalPrice);
		
		//step 1: first multiply the value to totalPrice by 100 to move the deciaml 2 places
		totalPrice *= 100;
		System.out.println("STUB B: VALUE totalPrice is now " + totalPrice);
		
		//step 2: create an int var to temp hold a value of total price as an int
		int temp = (int)totalPrice;
		System.out.println("STUB C: VALUE totalPrice truncated is now " + temp);
		
		//step 3: divide the temp var by 100 to move its decimal number 2 place back
		totalPrice = temp/(double)100;
		System.out.println("STUB D: VALUE totalPrice is now " + totalPrice);
		
		
		
		in.close();
		
	}

}
