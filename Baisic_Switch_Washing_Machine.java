package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Baisic_Switch_Washing_Machine.java
 *Purpose: shows the use of a switch statement to eval integer type input.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 4, 2018 | 2:46:34 PM
 */

import java.util.*;

public class Baisic_Switch_Washing_Machine
{

	public static void main(String[] args)
	{
		//create a scanner
		Scanner in = new Scanner(System.in);
		
		//explain program
		System.out.println("this app will simulate a coin washing machine");
		System.out.println("your choice for wash cycle are: \n");
		
		System.out.println("pick 1: for cold water");
		System.out.println("pick 2: for warm water");
		System.out.println("pick 3: for hot water");
		System.out.println("pick 4: for hot water with extra bleech");
		
		//input
		System.out.print("\nenter the number of your choice and press enter: ");
		int choice = in.nextInt();
		
		in.close();
		
		//processing
		switch(choice)
		{
			case 1: System.out.println("you selected " +choice+ " for cold water wash");
				break;
			case 2: System.out.println("you selected " +choice+ " for warm water wash");
				break;
			case 3: System.out.println("you selected " +choice+ " for hot water wash");
				break;
			case 4: System.out.println("you selected " +choice+ " for hot water wash with bleech");
				break;
			
			default: System.out.println("choices are 1, 2, 3, or 4. TRY AGAIN!");
		}//end switch

		
	}//end main

}//end class
