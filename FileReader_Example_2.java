/**
 * Program Name: FileReader_Example_2.java
 * Purpose: shows how to use a Scanner object to read in data from
 *         a text file.
 *         
 *         REVISION: used nextLine() in the loop to read in whole lines.
 *         
 *         REVISION 2: Used a try-catch structure to catch any FileNotFound Exceptions
 *                     so that our program will not crash.
 *         
 * Coder: Bill Pulling for Sec01
 * Date:Nov 16, 2018
 */
import java.util.Scanner;
import java.io.*;
public class FileReader_Example_2
{

	public static void main(String[] args)//throws FileNotFoundException
	{
		// Step 1: create a File object and pass it the name of the text file
		// that we want to read. 
		// We are using a relative path, so the file will have to located in
		// the project folder "File IO Ch7"
		
		//REVISION 2 HERE>>>put this code to create the File and Scanner inside a try block
		
		try
		{
			File fileOne = new File("SampleText1.txt");
			
			//Step 2: create the Scanner object and pass it the File object
			//        as an argument.
			
			//NOTE: this next line can throw a FileNotFoundException, so we need
			//       to "CONFESS" by including a throws clause on the method
			//       declaration.
			Scanner fileReader = new Scanner(fileOne);
			
			//Step 3:
			// Set up a while loop to read the contents of the file and print
			// them out. 
			
			while(fileReader.hasNextLine())
			{
				String word = fileReader.nextLine();
				System.out.println(word);
			}//end loop
		
		}//end try
		//REVISION 2 CONTINUED...put the catch block here and catch FileNotFoundException
		
		catch(FileNotFoundException ex)
		{
			System.out.println("Exception thrown, message is: " + ex.getMessage());
			//print the stack trace
			ex.printStackTrace();
		}
		
		
		System.out.println("End of program.");
		
		
		
	}
	//end main
}
//end class