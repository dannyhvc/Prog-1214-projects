package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Basic_Switch_UsingStrings.java
 *Purpose: shows how string objs can now be un through a swithc statment.
 *			  this featue was added  in jdk1.7
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Oct 4, 2018 | 2:35:27 PM
 */

import java.util.*;

public class Basic_Switch_UsingStrings
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//explination of the program
		System.out.println("this app will ask you to enter a 3 letter name.");
		System.out.println("if the name you enter is in the library, you win a prize.");
		
		System.out.print("\nEnter a 3 letter name and press enter: ");
		String name = in.next().toLowerCase();	
		
		in.close();
		
		//process
		switch(name)
		{
		case "tam":
		case "tim":
		case "tom": System.out.println("congrats! your entry of " + name + " is a winner"
												+ " YOU WIN A SMALL COFFEE");
			break;
			
		case "bob": System.out.println("congrats! your entry of " + name + " is a winner"
												+ " YOU WIN A LARGE COFFEE");
		break;
		default: System.out.println("sorry, your entre of name is not here.");
		}//end swtich
		
		

	}

}
