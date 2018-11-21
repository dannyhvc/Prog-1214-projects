package Selection_Structures_Chp3;

/**
 *Program Name: Selection_Structures_Chp3.String_Comparison_Example.java
 *Purpose: Shows how the string comparison sharl ("Brucette")
 *				 can nip you if you try the equaity operator ("==")
 *				 to comipare two strings lexicographicaly (do they have the same chars)
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 27, 2018 | 2:21:03 PM
 */

public class String_Comparison_Example
{

	public static void main(String[] args)
	{
		//create 2 strings 
		String name1 = "Bill";
		String name2 = "Bill";
		
		if(name1 == name2)
		{
			System.out.println("the string " + name1 + " is identical to " + name2);
			
		} else 
			{
				System.out.println("the string " + name1 + " is not identical to " + name2);
			
			}
		
		//second example using string using the new operator
		String name3 = new String("John");
		String name4 = new String("John");
		
		if(name3.equals(name4))
		{
			System.out.println("the string " + name3 + " is identical to " + name4);
			
		} else 
			{
				System.out.println("the string " + name3 + " is not identical to " + name4);
			
			}
		
		/**
		 * VERY IMPORTANT: when you use the equality operator with 2 obj, you are asking java if the 2 obj
		 * 								 have the same memory address, which would mean that they are the same objs.
		 */
		
		/**
		 * to porperly do a lexicographics comparisson of 2 string objs we must use the string method
		 * called eqauals(string another string)
		 */		

	}

}
