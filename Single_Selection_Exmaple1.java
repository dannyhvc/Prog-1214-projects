package Selection_Structures_Chp3; /**
 *Program Name: Single_Selection_Exmaple.java 
 *Purpose: Shows a single selection if statment without an else block
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 26, 2018 | 2:41:33 PM
 */

import java.util.*;//imports all classes in the package

public class Single_Selection_Exmaple1
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//input section
		//cruisin' down the 401...
		System.out.println("GPS: would you like to stop at the OnRoute?");
		System.out.println("enter a 'y' for yes or 'n' for no");
		char response = in.next().charAt(0);
		/**
		 * NOTE: Scanner doesn't have a method to read in chars therefore we must use
		 * 			 a string and then we use the string class method to called CharAt(int index#)
		 * 			 to convert it to a char data type.
		 */
		
		 if(response == 'y')
		 {
			 System.out.println("Changing route via Onroute");
			 
		 } else {
			 System.out.println("Continuing on current route");
			 
		 }//end condition
		
		in.close();
		
		
	}//end main

}//end class
