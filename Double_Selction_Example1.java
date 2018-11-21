package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Double_Selction_Example1.java
 *Purpose: shows a double selection structure that ises an if else structure
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 26, 2018 | 3:06:54 PM
 */

import java.util.*;

public class Double_Selction_Example1
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input section
		
		System.out.println("This program will tell if you number is greater or less than 5 (byte constraints)");
		System.out.println("enter an integer value and press enter");
		
		byte ui = in.nextByte();
		
		//precessing
		//double selection
		 if(ui > 5)
		 {
			 System.out.println("ui is greater than 5");
			 
		 } else if (ui == 5) {
			 System.out.println("ui is equal to 5");

		 } else {
			 System.out.println("ui is less than 5");
			 
		 }//end condition
		
		
		in.close();

	}

}
