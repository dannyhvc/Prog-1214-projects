package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.Letter_Grader.java
 *Purpose: shows a practical application of a multiple selection structure. also introduces concept
 *				 pseudo code.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 26, 2018 | 3:24:27 PM
 *
 *PSEUDO-CODE
 *1)create scanner: 
 *2)explain what prgoram does
 *3)input: ask user to enter grade and store it
 *4)Process: convert grade to  letter value if-else-if
 *	4.a)store the letter grade.
 *5)output: print letter frade to screen
 *6)housekeeping: close the scanner
 *
 */

import java.util.*;

public class Letter_Grader
{
	
	public static void main(String[] args)
	{
		
		String Lgrade;
		
		//1)create scanner: 
		Scanner in = new Scanner(System.in);
		
		//2)explain what prgoram does
		System.out.println("this program will convert a numeric grade to a letter grade");
		
		//3)input: ask user to enter grade and store it
		System.out.println("Enter a numeric grade: ");
		float grade = in.nextFloat();
		
		//4)Process: convert grade to letter value if-else-if
		
		if(grade >= 90)
		{
			Lgrade = "A+";
			
		} else if (grade >=80) {
			Lgrade = "A";			
			
		} else if (grade >= 75) {
			Lgrade = "B+";
			
		} else if (grade >= 70) {
			Lgrade = "B";
			
		} else if (grade >= 65) {
			Lgrade = "C+";
			
		} else if (grade >= 60) {
			Lgrade = "C";
			
		} else if (grade >= 55) {
			Lgrade = "D+";
			
		}	else if (grade >= 50) {
			Lgrade = "D";
			
		} else {
			Lgrade = "F";
			
		}//end grade condition
		
		//5)output: print letter frade to screen
		System.out.println("your letter grade is " + Lgrade);
		
		//6)housekeeping: close the scanner
		in.close();
		
	}//end main

}//end class
